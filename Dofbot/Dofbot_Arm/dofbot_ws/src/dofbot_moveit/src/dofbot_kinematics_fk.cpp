#include "dofbot_kinemarics.h"
#include <iostream>
using namespace KDL;
using namespace std;
Dofbot dofbot = Dofbot();

const float RA2DE = 180.0f / M_PI;

const float DE2RA = M_PI / 180.0f;
const char *urdf_file = "/home/dofbot/dofbot_ws/src/dofbot_moveit/urdf/dofbot.urdf";


int main(int argc, char **argv) {

    double s1 =atoi(argv[1]);
    double s2 =atoi(argv[2]);
    double s3 =atoi(argv[3]);
    double s4 =atoi(argv[4]);
    double s5 =atoi(argv[5]);
    //double joints[]{90, 40, 50, 130, 90};
    double joints[]{s1, s2, s3, s4, s5};

    vector<double> initjoints;

    vector<double> initpos;

    for (int i = 0; i < 5; ++i) initjoints.push_back((joints[i] - 90) * DE2RA);

    dofbot.dofbot_getFK(urdf_file, initjoints, initpos);
    cout << initpos.at(0) * 100 << "\t"
         << initpos.at(1) * 100 << "\t"
         << initpos.at(2) * 100 << endl;
    return 0;
}