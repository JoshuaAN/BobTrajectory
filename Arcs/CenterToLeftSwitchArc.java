package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (10.00,18.08,0.00)
	
    public CenterToLeftSwitchArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.568,11.351,10.000,0.000},
				{2.838,34.054,10.000,0.000},
				{7.946,68.107,10.000,0.000},
				{17.027,113.512,10.000,0.000},
				{31.216,170.268,10.000,0.000},
				{51.648,238.376,10.000,0.000},
				{79.459,317.834,10.000,0.000},
				{115.783,408.644,10.000,0.000},
				{161.755,510.805,10.000,0.000},
				{218.511,624.318,10.000,0.001},
				{287.186,749.181,10.000,0.001},
				{368.915,885.396,10.000,0.002},
				{464.833,1032.962,10.000,0.003},
				{576.075,1191.879,10.000,0.005},
				{703.209,1350.797,10.000,0.007},
				{846.234,1509.714,10.000,0.011},
				{1005.152,1668.631,10.000,0.015},
				{1179.961,1827.548,10.000,0.020},
				{1370.661,1986.466,10.000,0.028},
				{1577.254,2145.383,10.000,0.036},
				{1799.738,2304.300,10.000,0.047},
				{2038.114,2463.217,10.000,0.061},
				{2292.381,2622.135,10.000,0.077},
				{2562.541,2781.052,10.000,0.096},
				{2848.592,2939.969,10.000,0.118},
				{3150.534,3098.886,10.000,0.144},
				{3468.369,3257.804,10.000,0.174},
				{3802.095,3416.721,10.000,0.208},
				{4151.713,3575.638,10.000,0.248},
				{4517.223,3734.555,10.000,0.293},
				{4898.624,3893.472,10.000,0.343},
				{5295.917,4052.390,10.000,0.400},
				{5709.102,4211.307,10.000,0.464},
				{6138.179,4370.224,10.000,0.535},
				{6583.147,4529.141,10.000,0.613},
				{7044.007,4688.059,10.000,0.700},
				{7520.759,4846.976,10.000,0.796},
				{8013.402,5005.893,10.000,0.901},
				{8521.937,5164.810,10.000,1.016},
				{9046.364,5323.728,10.000,1.142},
				{9586.683,5482.645,10.000,1.279},
				{10142.893,5641.562,10.000,1.428},
				{10714.995,5800.479,10.000,1.589},
				{11302.989,5959.397,10.000,1.764},
				{11906.875,6118.314,10.000,1.952},
				{12526.652,6277.231,10.000,2.155},
				{13162.321,6436.148,10.000,2.374},
				{13813.881,6595.066,10.000,2.608},
				{14481.334,6753.983,10.000,2.859},
				{15164.678,6912.900,10.000,3.128},
				{15863.914,7071.817,10.000,3.415},
				{16579.042,7230.735,10.000,3.722},
				{17310.061,7389.652,10.000,4.049},
				{18056.972,7548.569,10.000,4.397},
				{18819.775,7707.486,10.000,4.767},
				{19598.469,7866.404,10.000,5.159},
				{20393.055,8025.321,10.000,5.576},
				{21203.533,8184.238,10.000,6.017},
				{22029.903,8343.155,10.000,6.484},
				{22872.164,8502.073,10.000,6.978},
				{23730.318,8660.990,10.000,7.499},
				{24604.362,8819.907,10.000,8.050},
				{25494.299,8978.824,10.000,8.629},
				{26400.127,9137.742,10.000,9.239},
				{27321.847,9296.659,10.000,9.881},
				{28259.459,9455.576,10.000,10.555},
				{29212.962,9614.493,10.000,11.262},
				{30182.358,9773.411,10.000,12.003},
				{31167.645,9932.328,10.000,12.778},
				{32168.823,10091.245,10.000,13.588},
				{33185.894,10250.162,10.000,14.434},
				{34218.856,10409.080,10.000,15.315},
				{35267.709,10567.997,10.000,16.231},
				{36332.455,10726.914,10.000,17.183},
				{37413.092,10885.831,10.000,18.170},
				{38509.054,11033.397,10.000,19.192},
				{39619.204,11169.612,10.000,20.245},
				{40742.409,11294.476,10.000,21.327},
				{41877.532,11407.988,10.000,22.436},
				{43023.439,11510.149,10.000,23.569},
				{44178.994,11600.959,10.000,24.722},
				{45343.063,11680.417,10.000,25.892},
				{46514.510,11748.525,10.000,27.075},
				{47692.200,11805.281,10.000,28.266},
				{48874.999,11850.686,10.000,29.462},
				{50061.770,11884.740,10.000,30.658},
				{51251.379,11907.442,10.000,31.850},
				{52442.691,11918.793,10.000,33.033},
				{53634.570,11918.793,10.000,34.205},
				{54826.449,11918.793,10.000,35.360},
				{56018.329,11918.793,10.000,36.498},
				{57210.208,11918.793,10.000,37.615},
				{58402.087,11918.793,10.000,38.710},
				{59593.967,11918.793,10.000,39.779},
				{60785.846,11918.793,10.000,40.823},
				{61977.725,11918.793,10.000,41.839},
				{63169.605,11918.793,10.000,42.826},
				{64361.484,11918.793,10.000,43.782},
				{65553.363,11918.793,10.000,44.708},
				{66745.243,11918.793,10.000,45.602},
				{67937.122,11918.793,10.000,46.465},
				{69129.001,11918.793,10.000,47.294},
				{70320.881,11918.793,10.000,48.092},
				{71512.760,11918.793,10.000,48.856},
				{72704.639,11918.793,10.000,49.589},
				{73896.519,11918.793,10.000,50.289},
				{75088.398,11918.793,10.000,50.957},
				{76280.277,11918.793,10.000,51.593},
				{77472.157,11918.793,10.000,52.197},
				{78664.036,11918.793,10.000,52.771},
				{79855.915,11918.793,10.000,53.314},
				{81047.795,11918.793,10.000,53.827},
				{82239.674,11918.793,10.000,54.310},
				{83431.553,11918.793,10.000,54.764},
				{84623.433,11918.793,10.000,55.190},
				{85815.312,11918.793,10.000,55.587},
				{87007.191,11918.793,10.000,55.956},
				{88199.071,11918.793,10.000,56.299},
				{89390.950,11918.793,10.000,56.614},
				{90582.829,11918.793,10.000,56.903},
				{91774.709,11918.793,10.000,57.165},
				{92966.588,11918.793,10.000,57.402},
				{94158.467,11918.793,10.000,57.614},
				{95350.347,11918.793,10.000,57.800},
				{96542.226,11918.793,10.000,57.962},
				{97734.105,11918.793,10.000,58.099},
				{98925.985,11918.793,10.000,58.211},
				{100117.864,11918.793,10.000,58.299},
				{101309.743,11918.793,10.000,58.363},
				{102501.623,11918.793,10.000,58.404},
				{103693.502,11918.793,10.000,58.420},
				{104885.381,11918.793,10.000,58.412},
				{106077.261,11918.793,10.000,58.380},
				{107269.140,11918.793,10.000,58.324},
				{108461.019,11918.793,10.000,58.244},
				{109652.899,11918.793,10.000,58.139},
				{110844.778,11918.793,10.000,58.011},
				{112036.657,11918.793,10.000,57.857},
				{113228.537,11918.793,10.000,57.679},
				{114420.416,11918.793,10.000,57.476},
				{115612.295,11918.793,10.000,57.248},
				{116804.175,11918.793,10.000,56.994},
				{117996.054,11918.793,10.000,56.714},
				{119187.933,11918.793,10.000,56.408},
				{120379.813,11918.793,10.000,56.075},
				{121571.692,11918.793,10.000,55.714},
				{122763.571,11918.793,10.000,55.327},
				{123955.451,11918.793,10.000,54.911},
				{125147.330,11918.793,10.000,54.466},
				{126339.209,11918.793,10.000,53.993},
				{127531.089,11918.793,10.000,53.490},
				{128722.968,11918.793,10.000,52.957},
				{129914.847,11918.793,10.000,52.394},
				{131106.727,11918.793,10.000,51.799},
				{132298.606,11918.793,10.000,51.174},
				{133490.485,11918.793,10.000,50.517},
				{134682.365,11918.793,10.000,49.828},
				{135874.244,11918.793,10.000,49.106},
				{137066.123,11918.793,10.000,48.353},
				{138258.003,11918.793,10.000,47.566},
				{139449.882,11918.793,10.000,46.747},
				{140641.761,11918.793,10.000,45.896},
				{141833.641,11918.793,10.000,45.012},
				{143025.520,11918.793,10.000,44.097},
				{144217.399,11918.793,10.000,43.151},
				{145409.279,11918.793,10.000,42.174},
				{146601.158,11918.793,10.000,41.168},
				{147793.037,11918.793,10.000,40.133},
				{148984.917,11918.793,10.000,39.072},
				{150176.796,11918.793,10.000,37.986},
				{151368.675,11918.793,10.000,36.876},
				{152560.555,11918.793,10.000,35.745},
				{153752.434,11918.793,10.000,34.595},
				{154944.313,11918.793,10.000,33.429},
				{156135.816,11911.261,10.000,32.249},
				{157325.998,11892.376,10.000,31.060},
				{158513.724,11862.141,10.000,29.865},
				{159697.859,11820.555,10.000,28.668},
				{160877.267,11767.617,10.000,27.475},
				{162050.814,11703.328,10.000,26.290},
				{163217.365,11627.688,10.000,25.115},
				{164375.784,11540.696,10.000,23.956},
				{165524.937,11442.354,10.000,22.816},
				{166663.688,11332.660,10.000,21.699},
				{167790.901,11211.615,10.000,20.607},
				{168905.443,11079.218,10.000,19.544},
				{170006.177,10935.471,10.000,18.512},
				{171091.969,10780.372,10.000,17.513},
				{172162.061,10621.454,10.000,16.549},
				{173216.260,10462.537,10.000,15.621},
				{174254.568,10303.620,10.000,14.727},
				{175276.984,10144.703,10.000,13.870},
				{176283.509,9985.785,10.000,13.048},
				{177274.141,9826.868,10.000,12.261},
				{178248.882,9667.951,10.000,11.509},
				{179207.732,9509.034,10.000,10.790},
				{180150.689,9350.116,10.000,10.105},
				{181077.755,9191.199,10.000,9.453},
				{181988.929,9032.282,10.000,8.832},
				{182884.211,8873.365,10.000,8.242},
				{183763.602,8714.448,10.000,7.682},
				{184627.101,8555.530,10.000,7.151},
				{185474.708,8396.613,10.000,6.648},
				{186306.423,8237.696,10.000,6.172},
				{187122.247,8078.779,10.000,5.722},
				{187922.179,7919.861,10.000,5.298},
				{188706.219,7760.944,10.000,4.897},
				{189474.368,7602.027,10.000,4.519},
				{190226.625,7443.110,10.000,4.164},
				{190962.990,7284.192,10.000,3.830},
				{191683.463,7125.275,10.000,3.517},
				{192388.045,6966.358,10.000,3.223},
				{193076.735,6807.441,10.000,2.948},
				{193749.533,6648.523,10.000,2.691},
				{194406.440,6489.606,10.000,2.451},
				{195047.454,6330.689,10.000,2.227},
				{195672.577,6171.772,10.000,2.019},
				{196281.809,6012.854,10.000,1.826},
				{196875.148,5853.937,10.000,1.647},
				{197452.596,5695.020,10.000,1.481},
				{198014.152,5536.103,10.000,1.328},
				{198559.817,5377.185,10.000,1.187},
				{199089.589,5218.268,10.000,1.058},
				{199603.470,5059.351,10.000,0.939},
				{200101.459,4900.434,10.000,0.831},
				{200583.557,4741.516,10.000,0.732},
				{201049.763,4582.599,10.000,0.642},
				{201500.077,4423.682,10.000,0.560},
				{201934.499,4264.765,10.000,0.487},
				{202353.030,4105.847,10.000,0.421},
				{202755.669,3946.930,10.000,0.362},
				{203142.416,3788.013,10.000,0.309},
				{203513.271,3629.096,10.000,0.262},
				{203868.235,3470.178,10.000,0.221},
				{204207.307,3311.261,10.000,0.185},
				{204530.487,3152.344,10.000,0.154},
				{204837.776,2993.427,10.000,0.126},
				{205129.172,2834.509,10.000,0.103},
				{205404.677,2675.592,10.000,0.083},
				{205664.291,2516.675,10.000,0.066},
				{205908.012,2357.758,10.000,0.052},
				{206135.842,2198.840,10.000,0.040},
				{206347.781,2039.923,10.000,0.030},
				{206543.827,1881.006,10.000,0.023},
				{206723.982,1722.089,10.000,0.017},
				{206888.245,1563.172,10.000,0.012},
				{207036.616,1404.254,10.000,0.008},
				{207169.096,1245.337,10.000,0.006},
				{207285.683,1086.420,10.000,0.004},
				{207386.756,935.035,10.000,0.002},
				{207473.258,795.002,10.000,0.001},
				{207546.324,666.320,10.000,0.001},
				{207607.090,548.989,10.000,0.000},
				{207656.690,443.010,10.000,0.000},
				{207696.259,348.382,10.000,0.000},
				{207726.934,265.105,10.000,0.000},
				{207749.848,193.179,10.000,0.000},
				{207766.137,132.604,10.000,0.000},
				{207776.936,83.381,10.000,0.000},
				{207783.381,45.509,10.000,0.000},
				{207786.606,18.988,10.000,0.000},
				{207787.746,3.818,10.000,0.000},
				{207787.937,0.000,10.000,-0.000},
				{207787.937,0.000,10.000,-0.000}		};

}