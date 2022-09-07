#include "dofbot_kinemarics.h"
#include <iostream>
#include <typeinfo>

using namespace KDL;
using namespace std;

Dofbot dofbot = Dofbot();

const float RA2DE = 180.0f / M_PI;

const float DE2RA = M_PI / 180.0f;
const char *urdf_file = "/home/dofbot/dofbot_ws/src/dofbot_moveit/urdf/dofbot.urdf";




vector<double> angles(double Roll, double x, double y, double z){
    
    double Pitch = 0;
    double Yaw = 0;

    //double x = -18.205983;
    //double y = 6.626446;
    //double z = 13.236477;
    
    double xyz[]{x, y, z};

    double rpy[]{Roll , Pitch, Yaw };

    vector<double> outjoints;

    vector<double> targetXYZ;

    vector<double> targetRPY;

    for (int k = 0; k < 3; ++k) targetXYZ.push_back(xyz[k] / 100);

    for (int l = 0; l < 3; ++l) targetRPY.push_back(rpy[l] * DE2RA);

    dofbot.dofbot_getIK(urdf_file, targetXYZ, targetRPY, outjoints);   
    
    return outjoints;
}


int main(int argc, char **argv) {
    
    double x =atoi(argv[1]);
    double y =atoi(argv[2]);
    double z =atoi(argv[3]);

    
    double Roll = 180;
    
    bool control = true;
    double cuenta = 6;
    
    while (control){
        if (Roll <= 180 && Roll >= -180){
            vector<double> outjoints = angles(Roll, x, y, z);
            for (int i = 0; i < 5; i++){
                if (outjoints.at(i) * RA2DE + 90 < -0.1){
                    cuenta -= 1;
                    Roll -= 0.1;
                }
            }
            
            if (outjoints.at(2) * RA2DE + 90 > 90) {
                cuenta -= 1;
                Roll -= 0.1;
            } else if (outjoints.at(3) * RA2DE + 90 > 90) {
                cuenta -= 1;
                Roll -= 0.1;
            } else if (((outjoints.at(2) * RA2DE + 90) - (outjoints.at(3) * RA2DE + 90)) > 30 || ((outjoints.at(2) * RA2DE + 90) - (outjoints.at(3) * RA2DE + 90)) < -30 ){
                cuenta -= 1;
                Roll -= 0.1;
            } else if (cuenta == 6){
                control = false;
            }
        } cuenta = 6;
    }

 
    vector<double> outjoints = angles(Roll, x, y, z);
    for (int i = 0; i < 5; i++) cout << outjoints.at(i) * RA2DE + 90 << "\t";
    cout << endl; 
    
    return 0;
}