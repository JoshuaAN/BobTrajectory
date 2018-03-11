package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FiveFeetAndTurnArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (5.00,5.00,89.99)
	
    public FiveFeetAndTurnArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FiveFeetAndTurnArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.445,8.895,10.000,0.000},
				{2.224,17.789,10.000,0.000},
				{6.226,40.025,10.000,0.000},
				{13.341,71.153,10.000,0.000},
				{24.459,111.173,10.000,0.000},
				{40.467,160.080,10.000,0.000},
				{62.254,217.871,10.000,0.000},
				{90.708,284.538,10.000,0.000},
				{126.715,360.072,10.000,0.000},
				{171.161,444.463,10.000,0.000},
				{224.931,537.695,10.000,0.000},
				{288.906,639.753,10.000,0.001},
				{363.967,750.614,10.000,0.001},
				{450.993,870.256,10.000,0.002},
				{550.858,998.649,10.000,0.002},
				{664.434,1135.761,10.000,0.003},
				{792.589,1281.555,10.000,0.005},
				{936.188,1435.989,10.000,0.007},
				{1096.090,1599.017,10.000,0.009},
				{1273.148,1770.586,10.000,0.013},
				{1467.770,1946.217,10.000,0.017},
				{1679.914,2121.443,10.000,0.022},
				{1909.537,2296.230,10.000,0.029},
				{2156.592,2470.541,10.000,0.036},
				{2421.026,2644.341,10.000,0.046},
				{2702.785,2817.597,10.000,0.057},
				{3001.812,2990.271,10.000,0.071},
				{3318.046,3162.331,10.000,0.086},
				{3651.419,3333.739,10.000,0.104},
				{4001.866,3504.462,10.000,0.125},
				{4369.312,3674.463,10.000,0.150},
				{4753.683,3843.707,10.000,0.177},
				{5154.898,4012.156,10.000,0.209},
				{5572.876,4179.773,10.000,0.244},
				{6007.527,4346.519,10.000,0.284},
				{6458.763,4512.354,10.000,0.328},
				{6926.487,4677.237,10.000,0.378},
				{7410.599,4841.126,10.000,0.433},
				{7910.997,5003.974,10.000,0.494},
				{8427.570,5165.736,10.000,0.562},
				{8960.206,5326.360,10.000,0.636},
				{9508.786,5485.795,10.000,0.718},
				{10073.184,5643.983,10.000,0.807},
				{10653.271,5800.866,10.000,0.905},
				{11248.909,5956.380,10.000,1.011},
				{11859.954,6110.454,10.000,1.127},
				{12486.256,6263.016,10.000,1.253},
				{13127.654,6413.986,10.000,1.389},
				{13783.982,6563.276,10.000,1.537},
				{14455.061,6710.795,10.000,1.697},
				{15140.288,6852.266,10.000,1.869},
				{15838.636,6983.477,10.000,2.055},
				{16549.079,7104.430,10.000,2.254},
				{17270.592,7215.130,10.000,2.468},
				{18002.150,7315.583,10.000,2.696},
				{18742.730,7405.797,10.000,2.939},
				{19491.308,7485.780,10.000,3.199},
				{20246.862,7555.547,10.000,3.475},
				{21008.373,7615.113,10.000,3.767},
				{21774.823,7664.498,10.000,4.077},
				{22545.196,7703.727,10.000,4.405},
				{23318.479,7732.832,10.000,4.751},
				{24093.664,7751.848,10.000,5.116},
				{24869.746,7760.821,10.000,5.500},
				{25645.727,7759.805,10.000,5.904},
				{26420.613,7748.865,10.000,6.329},
				{27193.421,7728.078,10.000,6.773},
				{27963.174,7697.533,10.000,7.239},
				{28728.908,7657.337,10.000,7.725},
				{29489.669,7607.611,10.000,8.233},
				{30244.895,7552.259,10.000,8.763},
				{30994.401,7495.060,10.000,9.315},
				{31737.996,7435.951,10.000,9.891},
				{32475.484,7374.878,10.000,10.491},
				{33206.663,7311.789,10.000,11.116},
				{33931.327,7246.644,10.000,11.766},
				{34649.268,7179.411,10.000,12.443},
				{35360.276,7110.071,10.000,13.147},
				{36064.137,7038.620,10.000,13.880},
				{36760.645,6965.070,10.000,14.642},
				{37449.590,6889.458,10.000,15.433},
				{38130.774,6811.841,10.000,16.255},
				{38804.005,6732.305,10.000,17.108},
				{39469.102,6650.970,10.000,17.994},
				{40125.901,6567.989,10.000,18.912},
				{40774.257,6483.558,10.000,19.864},
				{41414.048,6397.915,10.000,20.849},
				{42045.183,6311.347,10.000,21.869},
				{42667.602,6224.192,10.000,22.923},
				{43281.286,6136.843,10.000,24.011},
				{43886.261,6049.747,10.000,25.134},
				{44482.602,5963.412,10.000,26.291},
				{45070.442,5878.395,10.000,27.482},
				{45649.973,5795.310,10.000,28.705},
				{46221.454,5714.817,10.000,29.960},
				{46785.216,5637.614,10.000,31.246},
				{47341.658,5564.427,10.000,32.560},
				{47891.259,5496.001,10.000,33.902},
				{48434.566,5433.078,10.000,35.268},
				{48972.205,5376.385,10.000,36.656},
				{49504.866,5326.613,10.000,38.065},
				{50033.306,5284.396,10.000,39.490},
				{50558.335,5250.296,10.000,40.928},
				{51080.813,5224.778,10.000,42.377},
				{51601.633,5208.203,10.000,43.832},
				{52121.714,5200.805,10.000,45.290},
				{52641.983,5202.693,10.000,46.747},
				{53163.367,5213.838,10.000,48.200},
				{53686.775,5234.080,10.000,49.644},
				{54213.088,5263.132,10.000,51.078},
				{54743.147,5300.591,10.000,52.496},
				{55277.742,5345.947,10.000,53.897},
				{55817.603,5398.610,10.000,55.277},
				{56363.395,5457.919,10.000,56.633},
				{56915.711,5523.165,10.000,57.964},
				{57475.073,5593.615,10.000,59.267},
				{58041.925,5668.521,10.000,60.540},
				{58616.640,5747.147,10.000,61.782},
				{59199.517,5828.774,10.000,62.993},
				{59790.789,5912.720,10.000,64.169},
				{60390.623,5998.343,10.000,65.313},
				{60999.128,6085.051,10.000,66.422},
				{61616.359,6172.306,10.000,67.496},
				{62242.322,6259.627,10.000,68.536},
				{62876.981,6346.587,10.000,69.542},
				{63520.262,6432.817,10.000,70.513},
				{64172.062,6517.998,10.000,71.451},
				{64832.249,6601.866,10.000,72.356},
				{65500.668,6684.198,10.000,73.229},
				{66177.150,6764.817,10.000,74.069},
				{66861.509,6843.585,10.000,74.879},
				{67553.548,6920.395,10.000,75.658},
				{68253.065,6995.173,10.000,76.408},
				{68959.852,7067.871,10.000,77.129},
				{69673.699,7138.464,10.000,77.822},
				{70394.393,7206.944,10.000,78.488},
				{71121.726,7273.324,10.000,79.128},
				{71855.488,7337.627,10.000,79.743},
				{72595.477,7399.888,10.000,80.333},
				{73341.493,7460.154,10.000,80.899},
				{74093.340,7518.477,10.000,81.442},
				{74850.832,7574.915,10.000,81.963},
				{75613.636,7628.047,10.000,82.462},
				{76381.041,7674.045,10.000,82.940},
				{77152.087,7710.465,10.000,83.397},
				{77925.807,7737.191,10.000,83.833},
				{78701.219,7754.125,10.000,84.249},
				{79477.337,7761.181,10.000,84.645},
				{80253.166,7758.288,10.000,85.021},
				{81027.704,7745.384,10.000,85.379},
				{81799.946,7722.421,10.000,85.717},
				{82568.882,7689.355,10.000,86.038},
				{83333.497,7646.153,10.000,86.341},
				{84092.776,7592.786,10.000,86.627},
				{84845.699,7529.231,10.000,86.896},
				{85591.246,7455.470,10.000,87.149},
				{86328.395,7371.488,10.000,87.386},
				{87056.122,7277.273,10.000,87.608},
				{87773.404,7172.817,10.000,87.816},
				{88479.215,7058.112,10.000,88.010},
				{89172.530,6933.153,10.000,88.190},
				{89852.324,6797.936,10.000,88.357},
				{90517.733,6654.090,10.000,88.512},
				{91168.318,6505.853,10.000,88.656},
				{91803.906,6355.882,10.000,88.788},
				{92424.333,6204.267,10.000,88.910},
				{93029.442,6051.093,10.000,89.022},
				{93619.086,5896.436,10.000,89.125},
				{94193.123,5740.368,10.000,89.219},
				{94751.419,5582.957,10.000,89.305},
				{95293.845,5424.265,10.000,89.384},
				{95820.280,5264.349,10.000,89.456},
				{96330.606,5103.266,10.000,89.520},
				{96824.713,4941.066,10.000,89.579},
				{97302.493,4777.798,10.000,89.632},
				{97763.844,4613.508,10.000,89.680},
				{98208.668,4448.242,10.000,89.722},
				{98636.872,4282.040,10.000,89.760},
				{99048.366,4114.943,10.000,89.794},
				{99443.065,3946.992,10.000,89.824},
				{99820.888,3778.224,10.000,89.850},
				{100181.755,3608.676,10.000,89.873},
				{100525.594,3438.385,10.000,89.893},
				{100852.332,3267.387,10.000,89.910},
				{101161.904,3095.717,10.000,89.925},
				{101454.245,2923.411,10.000,89.937},
				{101729.296,2750.504,10.000,89.948},
				{101986.999,2577.031,10.000,89.957},
				{102227.301,2403.025,10.000,89.964},
				{102450.154,2228.524,10.000,89.970},
				{102655.510,2053.561,10.000,89.975},
				{102843.327,1878.173,10.000,89.979},
				{103013.738,1704.111,10.000,89.982},
				{103167.323,1535.847,10.000,89.984},
				{103304.938,1376.146,10.000,89.986},
				{103427.443,1225.057,10.000,89.987},
				{103535.706,1082.624,10.000,89.988},
				{103630.595,948.889,10.000,89.989},
				{103712.983,823.886,10.000,89.989},
				{103783.748,707.646,10.000,89.989},
				{103843.767,600.196,10.000,89.990},
				{103893.923,501.558,10.000,89.990},
				{103935.098,411.752,10.000,89.990},
				{103968.178,330.793,10.000,89.990},
				{103994.047,258.696,10.000,89.990},
				{104013.594,195.469,10.000,89.990},
				{104027.706,141.122,10.000,89.990},
				{104037.272,95.659,10.000,89.990},
				{104043.181,59.086,10.000,89.990},
				{104046.321,31.405,10.000,89.990},
				{104047.583,12.617,10.000,89.990},
				{104047.855,2.723,10.000,89.990},
				{104047.855,0.000,10.000,89.990}		};

}