from flask import Flask, jsonify, request,send_file
import time
from Arm_Lib import Arm_Device

app = Flask(__name__)
Arm = Arm_Device()
time.sleep(.1)


@app.route('/simple', methods = ['GET'])

def simple():

    id = int(request.args.get('id'))
    pos = int(request.args.get('pos', 90))

    def main():

        Arm.Arm_serial_servo_write(id, pos, 1000)

    main()
    return 'Movimiento completado'


@app.route('/multiple', methods = ['GET'])

def mult():

    id1 = int(request.args.get('id1', 90))
    id2 = int(request.args.get('id2', 90))
    id3 = int(request.args.get('id3', 90))
    id4 = int(request.args.get('id4', 90))
    id5 = int(request.args.get('id5', 90))
    id6 = int(request.args.get('id6', 90))
    
    def main():
        Arm.Arm_serial_servo_write6(id1, id2, id3, id4, id5, id6, 1000)

    main()
    return 'Movimiento completado'



@app.route('/movimiento', methods = ['GET'])

def mov():
    def main():
        Arm.greenBox(1500)

    main()
    return 'Movimiento completado'


#http://192.168.197.228:8000/multiple?id1=90&id2=90&id3=30&id4=50&id5=90&id6=90

app.run(debug=True, host='192.168.197.228',port=8000)
