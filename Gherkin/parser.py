def search_str(file_path):
    with open(file_path, 'r') as file, open('D:\github\mbt4cps-dofbotarm\Gherkin\parser.txt', mode='w') as output:
        # read all content of a file
        content = file.read()
        # check if string present in a file
        scenario = 'Rotate a single servo'
        given = 'We have an operational arm'
        when = 'rotateServoOperation'
        then = 'result'
        And = 'isAtSingleOperation'

        if scenario in content:
            output.write('''
Class: Machine
    StateMachine: RotateASingleServo
        PseudoState: Initial
        PseudoState: Final
        PseudoState: Error
''')

            if given in content:
                output.write('''
            
            Transition: (Initial->Given)
                Guard: []
            
            State: Given
                Activity: Arm.BaseServo.ServosOperations.posInicial(1000);
                
            State: GivenWarning
                Activity: MessReport(mWarning, Warning Time)
                
            Transition: (GivenWarning->Given)
                Guard: []
            
            Transition: (Given->GivenWarning)
                Guard: Arm.BaseServo.ServosOperations.Time(1000)
                
            Transition: (Given->When1)
                Guard: Arm.BaseServo.ServosOperations.isAt(90,90,90,90,90,90,2)
            ''')
            if when in content:
                idx = content.find(when)

                res = ''
                for idx in range(idx, len(content)):
                    if content[idx] == ' ':
                        break
                    res += content[idx]

                res = res.replace('rotateServoOperation', '')
                res = res.replace('\n','')
                res = res.replace('Then','')

                output.write('''
            State: When
                Activity: Arm.BaseServo.ServosOperations.rotateServoOperation'''+str(res)+'''
                '''
                )
                #print(content.find(when))
                if then in content:
                    idx = content.find(then)

                    res = ''
                    for idx in range(idx, len(content)):
                        if content[idx] == ' ':
                            break
                        res += content[idx+8]
                    
                    res = res.replace('s ','')

                    output.write('''
            Transition: (When->Error)
			    Guard: LaterThan(oRunTime, ''' + str(res) + ''')'''+'''
                ''')
                    if And in content:
                        idx = content.find(And)
                        res = ''
                        for idx in range(idx, len(content)):
                            if content[idx] == ' ':
                                break
                            res += content[idx+19]

                        output.write('''
            Transition: (When->Final)
			    Guard: Arm.BaseServo.ServosOperations.isAtSingleOperation'''+str(res)+''')'''+'''
                '''
                )

search_str(r'D:\github\mbt4cps-dofbotarm\Gherkin\Dofbot.feature')
