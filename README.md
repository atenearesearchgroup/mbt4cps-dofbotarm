# mbt4cps-dofbotarm

Everything related to the Dofbot robotic arm can be found in the [Dofbot](https://github.com/atenearesearchgroup/mbt4cps-dofbotarm/tree/main/Dofbot) section. This is specially useful for cloning this repository.

This section is organized in 3 sub-sections corresponding to:

- [UModel](https://github.com/atenearesearchgroup/mbt4cps-dofbotarm/tree/main/Dofbot/UModel): The diagrams used to generate the executables with Altova UModel.
- [dotnet-mcp](https://github.com/atenearesearchgroup/mbt4cps-dofbotarm/tree/main/Dofbot/dotnet-mcp): The project with the executable to use in the Raspberry Pi of the arm.
- [Dofbot_Arm](https://github.com/atenearesearchgroup/mbt4cps-dofbotarm/tree/main/Dofbot/Dofbot_Arm): All the low level code and libraries to make the arm connect with the Altova project and its executable files.


## Tool for the generation of tests by the user

In the section [UserTest](https://github.com/atenearesearchgroup/mbt4cps-dofbotarm/tree/main/UserTest) we can find a folder containing all the necessary files to include in a Java project in Eclipse for the use or modification of the tool for the generation of tests by the user.

A tutorial video and a manual about how to install everything and create or use this tool is also included.

## Tool for the generation of unitary tests

In the section [UnitaryTest](https://github.com/atenearesearchgroup/mbt4cps-dofbotarm/tree/main/UnitaryTest) we can find a folder containing all the necessary files, as well as an executable file, for generating unitary tests for the operations of a model that has been developed using the CordisModeler tool. These tests can then be launched on the robot corresponding to the model developed. The folder also includes an user manual and a video example explaining how to create and deploy tests using the CordisModeler export file as an input.

## Teaser video

A video that shows our toolkit for the automatic generation of both unit and system tests a Robotic Arm from its high-level UML models (created with the [CORDIS Modeler tool](https://www.cordis-suite.com/)) can be found at [https://atenea.lcc.uma.es/projects/res_ja2020/Model-based_Testing.mp4](https://atenea.lcc.uma.es/projects/res_ja2020/Model-based_Testing.mp4).
