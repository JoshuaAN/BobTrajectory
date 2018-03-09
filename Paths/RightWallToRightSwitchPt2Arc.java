package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (2.00,-1.00,-30.00)
	
    public RightWallToRightSwitchPt2() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightSwitchPt2(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.141,2.818,10.000,0.000},
				{0.705,5.637,10.000,-0.000},
				{1.974,12.690,10.000,-0.000},
				{4.232,22.581,10.000,-0.000},
				{7.766,35.339,10.000,-0.000},
				{12.866,51.006,10.000,-0.000},
				{19.831,69.648,10.000,-0.001},
				{28.823,89.924,10.000,-0.002},
				{39.871,110.481,10.000,-0.004},
				{53.009,131.379,10.000,-0.007},
				{68.277,152.676,10.000,-0.011},
				{85.720,174.431,10.000,-0.017},
				{105.390,196.698,10.000,-0.026},
				{127.343,219.531,10.000,-0.037},
				{151.641,242.982,10.000,-0.052},
				{178.351,267.102,10.000,-0.070},
				{207.545,291.937,10.000,-0.094},
				{239.298,317.534,10.000,-0.122},
				{273.692,343.936,10.000,-0.157},
				{310.810,371.184,10.000,-0.198},
				{350.742,399.319,10.000,-0.248},
				{393.580,428.378,10.000,-0.305},
				{439.419,458.395,10.000,-0.372},
				{488.360,489.406,10.000,-0.450},
				{540.504,521.441,10.000,-0.538},
				{595.957,554.531,10.000,-0.639},
				{654.828,588.705,10.000,-0.752},
				{717.227,623.990,10.000,-0.880},
				{783.268,660.411,10.000,-1.023},
				{853.067,697.992,10.000,-1.183},
				{926.742,736.755,10.000,-1.359},
				{1004.415,776.720,10.000,-1.554},
				{1086.205,817.907,10.000,-1.769},
				{1172.238,860.331,10.000,-2.004},
				{1262.639,904.006,10.000,-2.261},
				{1357.533,948.943,10.000,-2.540},
				{1457.048,995.147,10.000,-2.844},
				{1561.310,1042.621,10.000,-3.173},
				{1670.446,1091.361,10.000,-3.529},
				{1784.582,1141.357,10.000,-3.912},
				{1903.841,1192.592,10.000,-4.323},
				{2028.345,1245.038,10.000,-4.765},
				{2158.211,1298.656,10.000,-5.237},
				{2293.550,1353.395,10.000,-5.741},
				{2434.469,1409.188,10.000,-6.277},
				{2581.064,1465.950,10.000,-6.848},
				{2733.422,1523.578,10.000,-7.453},
				{2891.616,1581.943,10.000,-8.093},
				{3055.706,1640.895,10.000,-8.768},
				{3225.731,1700.255,10.000,-9.480},
				{3401.712,1759.812,10.000,-10.228},
				{3583.645,1819.327,10.000,-11.012},
				{3771.498,1878.526,10.000,-11.831},
				{3965.208,1937.104,10.000,-12.687},
				{4164.680,1994.720,10.000,-13.576},
				{4369.781,2051.006,10.000,-14.499},
				{4580.337,2105.564,10.000,-15.453},
				{4796.134,2157.974,10.000,-16.438},
				{5016.914,2207.799,10.000,-17.449},
				{5242.374,2254.595,10.000,-18.485},
				{5472.166,2297.919,10.000,-19.543},
				{5705.900,2337.340,10.000,-20.618},
				{5943.145,2372.453,10.000,-21.708},
				{6183.433,2402.885,10.000,-22.807},
				{6426.265,2428.314,10.000,-23.912},
				{6671.112,2448.473,10.000,-25.016},
				{6917.428,2463.161,10.000,-26.117},
				{7164.653,2472.249,10.000,-27.207},
				{7412.221,2475.683,10.000,-28.283},
				{7659.570,2473.483,10.000,-29.339},
				{7906.144,2465.742,10.000,-30.370},
				{8151.406,2452.617,10.000,-31.371},
				{8394.838,2434.322,10.000,-32.337},
				{8635.709,2408.708,10.000,-33.263},
				{8873.106,2373.977,10.000,-34.144},
				{9106.205,2330.987,10.000,-34.975},
				{9334.269,2280.638,10.000,-35.750},
				{9556.653,2223.843,10.000,-36.468},
				{9772.804,2161.506,10.000,-37.125},
				{9982.099,2092.951,10.000,-37.719},
				{10184.020,2019.214,10.000,-38.250},
				{10378.292,1942.718,10.000,-38.717},
				{10564.709,1864.170,10.000,-39.121},
				{10743.130,1784.215,10.000,-39.463},
				{10913.474,1703.434,10.000,-39.745},
				{11075.709,1622.349,10.000,-39.970},
				{11229.972,1542.636,10.000,-40.140},
				{11376.578,1466.053,10.000,-40.258},
				{11515.870,1392.927,10.000,-40.327},
				{11648.190,1323.192,10.000,-40.352},
				{11773.867,1256.776,10.000,-40.333},
				{11893.228,1193.608,10.000,-40.275},
				{12006.590,1133.620,10.000,-40.181},
				{12114.264,1076.744,10.000,-40.053},
				{12216.556,1022.914,10.000,-39.894},
				{12313.762,972.066,10.000,-39.707},
				{12406.176,924.135,10.000,-39.494},
				{12494.082,879.059,10.000,-39.258},
				{12577.759,836.772,10.000,-39.001},
				{12657.480,797.207,10.000,-38.726},
				{12733.509,760.295,10.000,-38.436},
				{12806.105,725.960,10.000,-38.133},
				{12875.518,694.125,10.000,-37.818},
				{12941.988,664.705,10.000,-37.495},
				{13005.749,637.611,10.000,-37.165},
				{13067.024,612.747,10.000,-36.830},
				{13126.025,590.011,10.000,-36.493},
				{13182.955,569.297,10.000,-36.155},
				{13238.004,550.491,10.000,-35.817},
				{13291.351,533.474,10.000,-35.482},
				{13343.164,518.125,10.000,-35.151},
				{13393.596,504.318,10.000,-34.826},
				{13442.788,491.922,10.000,-34.507},
				{13490.869,480.808,10.000,-34.195},
				{13537.953,470.842,10.000,-33.893},
				{13584.142,461.892,10.000,-33.601},
				{13629.525,453.827,10.000,-33.319},
				{13674.177,446.517,10.000,-33.048},
				{13718.160,439.834,10.000,-32.789},
				{13761.525,433.655,10.000,-32.543},
				{13804.311,427.859,10.000,-32.309},
				{13846.544,422.330,10.000,-32.088},
				{13888.240,416.959,10.000,-31.880},
				{13929.405,411.642,10.000,-31.686},
				{13970.033,406.280,10.000,-31.504},
				{14010.111,400.782,10.000,-31.335},
				{14049.617,395.062,10.000,-31.179},
				{14088.521,389.043,10.000,-31.036},
				{14126.787,382.654,10.000,-30.904},
				{14164.370,375.832,10.000,-30.784},
				{14201.222,368.519,10.000,-30.676},
				{14237.288,360.668,10.000,-30.578},
				{14272.512,352.236,10.000,-30.491},
				{14306.831,343.188,10.000,-30.413},
				{14340.180,333.496,10.000,-30.345},
				{14372.494,323.140,10.000,-30.285},
				{14403.705,312.105,10.000,-30.232},
				{14433.743,300.383,10.000,-30.188},
				{14462.540,287.972,10.000,-30.149},
				{14490.028,274.877,10.000,-30.117},
				{14516.139,261.109,10.000,-30.090},
				{14540.807,246.681,10.000,-30.068},
				{14563.969,231.617,10.000,-30.051},
				{14585.563,215.940,10.000,-30.037},
				{14605.531,199.681,10.000,-30.026},
				{14623.819,182.876,10.000,-30.017},
				{14640.375,165.563,10.000,-30.011},
				{14655.153,147.783,10.000,-30.007},
				{14668.111,129.582,10.000,-30.004},
				{14679.212,111.008,10.000,-30.002},
				{14688.423,92.113,10.000,-30.001},
				{14695.718,72.950,10.000,-30.000},
				{14701.183,54.649,10.000,-30.000},
				{14705.052,38.682,10.000,-30.000},
				{14707.595,25.435,10.000,-30.000},
				{14709.091,14.954,10.000,-30.000},
				{14709.817,7.267,10.000,-30.000},
				{14710.056,2.389,10.000,-30.000},
				{14710.089,0.327,10.000,-30.000},
				{14710.089,0.000,10.000,-30.000}		};

}