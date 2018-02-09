package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CrossTheLine extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (10.00,0.00,0.00)
	
    public CrossTheLine() {
		super();
		
		double[][] leftPoints = {
				{0.077,1.545,10.000},
				{0.386,3.090,10.000},
				{1.081,6.952,10.000},
				{2.317,12.359,10.000},
				{4.248,19.310,10.000},
				{7.029,27.807,10.000},
				{10.814,37.848,10.000},
				{15.757,49.435,10.000},
				{22.014,62.566,10.000},
				{29.738,77.242,10.000},
				{39.084,93.463,10.000},
				{50.207,111.228,10.000},
				{63.261,130.539,10.000},
				{78.400,151.394,10.000},
				{95.780,173.794,10.000},
				{115.554,197.739,10.000},
				{137.877,223.229,10.000},
				{162.826,249.491,10.000},
				{190.401,275.753,10.000},
				{220.603,302.015,10.000},
				{253.430,328.278,10.000},
				{288.884,354.540,10.000},
				{326.964,380.802,10.000},
				{367.671,407.064,10.000},
				{411.003,433.326,10.000},
				{456.962,459.589,10.000},
				{505.547,485.851,10.000},
				{556.759,512.113,10.000},
				{610.596,538.375,10.000},
				{667.060,564.637,10.000},
				{726.150,590.900,10.000},
				{787.866,617.162,10.000},
				{852.208,643.424,10.000},
				{919.177,669.686,10.000},
				{988.772,695.948,10.000},
				{1060.993,722.211,10.000},
				{1135.840,748.473,10.000},
				{1213.314,774.735,10.000},
				{1293.413,800.997,10.000},
				{1376.139,827.259,10.000},
				{1461.414,852.749,10.000},
				{1549.084,876.694,10.000},
				{1638.993,899.094,10.000},
				{1730.988,919.950,10.000},
				{1824.914,939.260,10.000},
				{1920.617,957.026,10.000},
				{2017.941,973.246,10.000},
				{2116.734,987.922,10.000},
				{2216.839,1001.053,10.000},
				{2318.103,1012.640,10.000},
				{2420.371,1022.681,10.000},
				{2523.489,1031.178,10.000},
				{2627.302,1038.129,10.000},
				{2731.655,1043.536,10.000},
				{2836.395,1047.398,10.000},
				{2941.367,1049.716,10.000},
				{3046.416,1050.488,10.000},
				{3151.464,1050.488,10.000},
				{3256.513,1050.488,10.000},
				{3361.562,1050.488,10.000},
				{3466.611,1050.488,10.000},
				{3571.660,1050.488,10.000},
				{3676.708,1050.488,10.000},
				{3781.757,1050.488,10.000},
				{3886.806,1050.488,10.000},
				{3991.855,1050.488,10.000},
				{4096.904,1050.488,10.000},
				{4201.952,1050.488,10.000},
				{4307.001,1050.488,10.000},
				{4412.050,1050.488,10.000},
				{4517.099,1050.488,10.000},
				{4622.148,1050.488,10.000},
				{4727.196,1050.488,10.000},
				{4832.245,1050.488,10.000},
				{4937.294,1050.488,10.000},
				{5042.343,1050.488,10.000},
				{5147.392,1050.488,10.000},
				{5252.441,1050.488,10.000},
				{5357.489,1050.488,10.000},
				{5462.538,1050.488,10.000},
				{5567.587,1050.488,10.000},
				{5672.636,1050.488,10.000},
				{5777.685,1050.488,10.000},
				{5882.733,1050.488,10.000},
				{5987.782,1050.488,10.000},
				{6092.831,1050.488,10.000},
				{6197.880,1050.488,10.000},
				{6302.929,1050.488,10.000},
				{6407.977,1050.488,10.000},
				{6513.026,1050.488,10.000},
				{6618.075,1050.488,10.000},
				{6723.124,1050.488,10.000},
				{6828.173,1050.488,10.000},
				{6933.221,1050.488,10.000},
				{7038.270,1050.488,10.000},
				{7143.319,1050.488,10.000},
				{7248.368,1050.488,10.000},
				{7353.417,1050.488,10.000},
				{7458.466,1050.488,10.000},
				{7563.514,1050.488,10.000},
				{7668.563,1050.488,10.000},
				{7773.612,1050.488,10.000},
				{7878.661,1050.488,10.000},
				{7983.710,1050.488,10.000},
				{8088.758,1050.488,10.000},
				{8193.807,1050.488,10.000},
				{8298.856,1050.488,10.000},
				{8403.905,1050.488,10.000},
				{8508.954,1050.488,10.000},
				{8614.002,1050.488,10.000},
				{8719.051,1050.488,10.000},
				{8824.100,1050.488,10.000},
				{8929.149,1050.488,10.000},
				{9034.198,1050.488,10.000},
				{9139.247,1050.488,10.000},
				{9244.295,1050.488,10.000},
				{9349.344,1050.488,10.000},
				{9454.393,1050.488,10.000},
				{9559.442,1050.488,10.000},
				{9664.491,1050.488,10.000},
				{9769.539,1050.488,10.000},
				{9874.588,1050.488,10.000},
				{9979.637,1050.488,10.000},
				{10084.686,1050.488,10.000},
				{10189.735,1050.488,10.000},
				{10294.783,1050.488,10.000},
				{10399.832,1050.488,10.000},
				{10504.881,1050.488,10.000},
				{10609.930,1050.488,10.000},
				{10714.979,1050.488,10.000},
				{10820.027,1050.488,10.000},
				{10925.076,1050.488,10.000},
				{11030.125,1050.488,10.000},
				{11135.174,1050.488,10.000},
				{11240.223,1050.488,10.000},
				{11345.272,1050.488,10.000},
				{11450.320,1050.488,10.000},
				{11555.369,1050.488,10.000},
				{11660.418,1050.488,10.000},
				{11765.467,1050.488,10.000},
				{11870.516,1050.488,10.000},
				{11975.564,1050.488,10.000},
				{12080.613,1050.488,10.000},
				{12185.662,1050.488,10.000},
				{12290.711,1050.488,10.000},
				{12395.760,1050.488,10.000},
				{12500.808,1050.488,10.000},
				{12605.857,1050.488,10.000},
				{12710.906,1050.488,10.000},
				{12815.955,1050.488,10.000},
				{12921.004,1050.488,10.000},
				{13026.053,1050.488,10.000},
				{13131.101,1050.488,10.000},
				{13236.150,1050.488,10.000},
				{13341.199,1050.488,10.000},
				{13446.248,1050.488,10.000},
				{13551.297,1050.488,10.000},
				{13656.345,1050.488,10.000},
				{13761.394,1050.488,10.000},
				{13866.443,1050.488,10.000},
				{13971.492,1050.488,10.000},
				{14076.541,1050.488,10.000},
				{14181.589,1050.488,10.000},
				{14286.638,1050.488,10.000},
				{14391.687,1050.488,10.000},
				{14496.736,1050.488,10.000},
				{14601.785,1050.488,10.000},
				{14706.833,1050.488,10.000},
				{14811.882,1050.488,10.000},
				{14916.931,1050.488,10.000},
				{15021.980,1050.488,10.000},
				{15127.029,1050.488,10.000},
				{15232.078,1050.488,10.000},
				{15337.126,1050.488,10.000},
				{15442.175,1050.488,10.000},
				{15547.224,1050.488,10.000},
				{15652.273,1050.488,10.000},
				{15757.322,1050.488,10.000},
				{15862.370,1050.488,10.000},
				{15967.419,1050.488,10.000},
				{16072.468,1050.488,10.000},
				{16177.517,1050.488,10.000},
				{16282.566,1050.488,10.000},
				{16387.614,1050.488,10.000},
				{16492.663,1050.488,10.000},
				{16597.712,1050.488,10.000},
				{16702.761,1050.488,10.000},
				{16807.810,1050.488,10.000},
				{16912.858,1050.488,10.000},
				{17017.907,1050.488,10.000},
				{17122.956,1050.488,10.000},
				{17228.005,1050.488,10.000},
				{17333.054,1050.488,10.000},
				{17438.103,1050.488,10.000},
				{17543.151,1050.488,10.000},
				{17648.200,1050.488,10.000},
				{17753.249,1050.488,10.000},
				{17858.298,1050.488,10.000},
				{17963.347,1050.488,10.000},
				{18068.395,1050.488,10.000},
				{18173.444,1050.488,10.000},
				{18278.493,1050.488,10.000},
				{18383.542,1050.488,10.000},
				{18488.591,1050.488,10.000},
				{18593.639,1050.488,10.000},
				{18698.688,1050.488,10.000},
				{18803.737,1050.488,10.000},
				{18908.786,1050.488,10.000},
				{19013.835,1050.488,10.000},
				{19118.884,1050.488,10.000},
				{19223.932,1050.488,10.000},
				{19328.981,1050.488,10.000},
				{19434.030,1050.488,10.000},
				{19539.079,1050.488,10.000},
				{19644.128,1050.488,10.000},
				{19749.176,1050.488,10.000},
				{19854.225,1050.488,10.000},
				{19959.274,1050.488,10.000},
				{20064.323,1050.488,10.000},
				{20169.372,1050.488,10.000},
				{20274.420,1050.488,10.000},
				{20379.469,1050.488,10.000},
				{20484.518,1050.488,10.000},
				{20589.567,1050.488,10.000},
				{20694.616,1050.488,10.000},
				{20799.664,1050.488,10.000},
				{20904.713,1050.488,10.000},
				{21009.762,1050.488,10.000},
				{21114.811,1050.488,10.000},
				{21219.860,1050.488,10.000},
				{21324.909,1050.488,10.000},
				{21429.957,1050.488,10.000},
				{21535.006,1050.488,10.000},
				{21640.055,1050.488,10.000},
				{21745.104,1050.488,10.000},
				{21850.153,1050.488,10.000},
				{21955.201,1050.488,10.000},
				{22060.250,1050.488,10.000},
				{22165.299,1050.488,10.000},
				{22270.348,1050.488,10.000},
				{22375.397,1050.488,10.000},
				{22480.445,1050.488,10.000},
				{22585.494,1050.488,10.000},
				{22690.543,1050.488,10.000},
				{22795.592,1050.488,10.000},
				{22900.641,1050.488,10.000},
				{23005.690,1050.488,10.000},
				{23110.738,1050.488,10.000},
				{23215.787,1050.488,10.000},
				{23320.836,1050.488,10.000},
				{23425.808,1049.716,10.000},
				{23530.547,1047.398,10.000},
				{23634.901,1043.536,10.000},
				{23738.714,1038.129,10.000},
				{23841.832,1031.178,10.000},
				{23944.100,1022.681,10.000},
				{24045.364,1012.640,10.000},
				{24145.469,1001.053,10.000},
				{24244.261,987.922,10.000},
				{24341.586,973.246,10.000},
				{24437.289,957.026,10.000},
				{24531.215,939.260,10.000},
				{24623.209,919.950,10.000},
				{24713.119,899.094,10.000},
				{24800.788,876.694,10.000},
				{24886.063,852.749,10.000},
				{24968.789,827.259,10.000},
				{25048.889,800.997,10.000},
				{25126.362,774.735,10.000},
				{25201.210,748.473,10.000},
				{25273.431,722.211,10.000},
				{25343.026,695.948,10.000},
				{25409.994,669.686,10.000},
				{25474.337,643.424,10.000},
				{25536.053,617.162,10.000},
				{25595.143,590.900,10.000},
				{25651.606,564.637,10.000},
				{25705.444,538.375,10.000},
				{25756.655,512.113,10.000},
				{25805.240,485.851,10.000},
				{25851.199,459.589,10.000},
				{25894.532,433.326,10.000},
				{25935.238,407.064,10.000},
				{25973.318,380.802,10.000},
				{26008.772,354.540,10.000},
				{26041.600,328.278,10.000},
				{26071.802,302.015,10.000},
				{26099.377,275.753,10.000},
				{26124.326,249.491,10.000},
				{26146.649,223.229,10.000},
				{26166.423,197.739,10.000},
				{26183.802,173.794,10.000},
				{26198.942,151.394,10.000},
				{26211.995,130.539,10.000},
				{26223.118,111.228,10.000},
				{26232.465,93.463,10.000},
				{26240.189,77.242,10.000},
				{26246.445,62.566,10.000},
				{26251.389,49.435,10.000},
				{26255.174,37.848,10.000},
				{26257.954,27.807,10.000},
				{26259.885,19.310,10.000},
				{26261.121,12.359,10.000},
				{26261.816,6.952,10.000},
				{26262.125,3.090,10.000},
				{26262.203,0.772,10.000},
				{26262.203,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.077,1.545,10.000},
				{0.386,3.090,10.000},
				{1.081,6.952,10.000},
				{2.317,12.359,10.000},
				{4.248,19.310,10.000},
				{7.029,27.807,10.000},
				{10.814,37.848,10.000},
				{15.757,49.435,10.000},
				{22.014,62.566,10.000},
				{29.738,77.242,10.000},
				{39.084,93.463,10.000},
				{50.207,111.228,10.000},
				{63.261,130.539,10.000},
				{78.400,151.394,10.000},
				{95.780,173.794,10.000},
				{115.554,197.739,10.000},
				{137.877,223.229,10.000},
				{162.826,249.491,10.000},
				{190.401,275.753,10.000},
				{220.603,302.015,10.000},
				{253.430,328.278,10.000},
				{288.884,354.540,10.000},
				{326.964,380.802,10.000},
				{367.671,407.064,10.000},
				{411.003,433.326,10.000},
				{456.962,459.589,10.000},
				{505.547,485.851,10.000},
				{556.759,512.113,10.000},
				{610.596,538.375,10.000},
				{667.060,564.637,10.000},
				{726.150,590.900,10.000},
				{787.866,617.162,10.000},
				{852.208,643.424,10.000},
				{919.177,669.686,10.000},
				{988.772,695.948,10.000},
				{1060.993,722.211,10.000},
				{1135.840,748.473,10.000},
				{1213.314,774.735,10.000},
				{1293.413,800.997,10.000},
				{1376.139,827.259,10.000},
				{1461.414,852.749,10.000},
				{1549.084,876.694,10.000},
				{1638.993,899.094,10.000},
				{1730.988,919.950,10.000},
				{1824.914,939.260,10.000},
				{1920.617,957.026,10.000},
				{2017.941,973.246,10.000},
				{2116.734,987.922,10.000},
				{2216.839,1001.053,10.000},
				{2318.103,1012.640,10.000},
				{2420.371,1022.681,10.000},
				{2523.489,1031.178,10.000},
				{2627.302,1038.129,10.000},
				{2731.655,1043.536,10.000},
				{2836.395,1047.398,10.000},
				{2941.367,1049.716,10.000},
				{3046.416,1050.488,10.000},
				{3151.464,1050.488,10.000},
				{3256.513,1050.488,10.000},
				{3361.562,1050.488,10.000},
				{3466.611,1050.488,10.000},
				{3571.660,1050.488,10.000},
				{3676.708,1050.488,10.000},
				{3781.757,1050.488,10.000},
				{3886.806,1050.488,10.000},
				{3991.855,1050.488,10.000},
				{4096.904,1050.488,10.000},
				{4201.952,1050.488,10.000},
				{4307.001,1050.488,10.000},
				{4412.050,1050.488,10.000},
				{4517.099,1050.488,10.000},
				{4622.148,1050.488,10.000},
				{4727.196,1050.488,10.000},
				{4832.245,1050.488,10.000},
				{4937.294,1050.488,10.000},
				{5042.343,1050.488,10.000},
				{5147.392,1050.488,10.000},
				{5252.441,1050.488,10.000},
				{5357.489,1050.488,10.000},
				{5462.538,1050.488,10.000},
				{5567.587,1050.488,10.000},
				{5672.636,1050.488,10.000},
				{5777.685,1050.488,10.000},
				{5882.733,1050.488,10.000},
				{5987.782,1050.488,10.000},
				{6092.831,1050.488,10.000},
				{6197.880,1050.488,10.000},
				{6302.929,1050.488,10.000},
				{6407.977,1050.488,10.000},
				{6513.026,1050.488,10.000},
				{6618.075,1050.488,10.000},
				{6723.124,1050.488,10.000},
				{6828.173,1050.488,10.000},
				{6933.221,1050.488,10.000},
				{7038.270,1050.488,10.000},
				{7143.319,1050.488,10.000},
				{7248.368,1050.488,10.000},
				{7353.417,1050.488,10.000},
				{7458.466,1050.488,10.000},
				{7563.514,1050.488,10.000},
				{7668.563,1050.488,10.000},
				{7773.612,1050.488,10.000},
				{7878.661,1050.488,10.000},
				{7983.710,1050.488,10.000},
				{8088.758,1050.488,10.000},
				{8193.807,1050.488,10.000},
				{8298.856,1050.488,10.000},
				{8403.905,1050.488,10.000},
				{8508.954,1050.488,10.000},
				{8614.002,1050.488,10.000},
				{8719.051,1050.488,10.000},
				{8824.100,1050.488,10.000},
				{8929.149,1050.488,10.000},
				{9034.198,1050.488,10.000},
				{9139.247,1050.488,10.000},
				{9244.295,1050.488,10.000},
				{9349.344,1050.488,10.000},
				{9454.393,1050.488,10.000},
				{9559.442,1050.488,10.000},
				{9664.491,1050.488,10.000},
				{9769.539,1050.488,10.000},
				{9874.588,1050.488,10.000},
				{9979.637,1050.488,10.000},
				{10084.686,1050.488,10.000},
				{10189.735,1050.488,10.000},
				{10294.783,1050.488,10.000},
				{10399.832,1050.488,10.000},
				{10504.881,1050.488,10.000},
				{10609.930,1050.488,10.000},
				{10714.979,1050.488,10.000},
				{10820.027,1050.488,10.000},
				{10925.076,1050.488,10.000},
				{11030.125,1050.488,10.000},
				{11135.174,1050.488,10.000},
				{11240.223,1050.488,10.000},
				{11345.272,1050.488,10.000},
				{11450.320,1050.488,10.000},
				{11555.369,1050.488,10.000},
				{11660.418,1050.488,10.000},
				{11765.467,1050.488,10.000},
				{11870.516,1050.488,10.000},
				{11975.564,1050.488,10.000},
				{12080.613,1050.488,10.000},
				{12185.662,1050.488,10.000},
				{12290.711,1050.488,10.000},
				{12395.760,1050.488,10.000},
				{12500.808,1050.488,10.000},
				{12605.857,1050.488,10.000},
				{12710.906,1050.488,10.000},
				{12815.955,1050.488,10.000},
				{12921.004,1050.488,10.000},
				{13026.053,1050.488,10.000},
				{13131.101,1050.488,10.000},
				{13236.150,1050.488,10.000},
				{13341.199,1050.488,10.000},
				{13446.248,1050.488,10.000},
				{13551.297,1050.488,10.000},
				{13656.345,1050.488,10.000},
				{13761.394,1050.488,10.000},
				{13866.443,1050.488,10.000},
				{13971.492,1050.488,10.000},
				{14076.541,1050.488,10.000},
				{14181.589,1050.488,10.000},
				{14286.638,1050.488,10.000},
				{14391.687,1050.488,10.000},
				{14496.736,1050.488,10.000},
				{14601.785,1050.488,10.000},
				{14706.833,1050.488,10.000},
				{14811.882,1050.488,10.000},
				{14916.931,1050.488,10.000},
				{15021.980,1050.488,10.000},
				{15127.029,1050.488,10.000},
				{15232.078,1050.488,10.000},
				{15337.126,1050.488,10.000},
				{15442.175,1050.488,10.000},
				{15547.224,1050.488,10.000},
				{15652.273,1050.488,10.000},
				{15757.322,1050.488,10.000},
				{15862.370,1050.488,10.000},
				{15967.419,1050.488,10.000},
				{16072.468,1050.488,10.000},
				{16177.517,1050.488,10.000},
				{16282.566,1050.488,10.000},
				{16387.614,1050.488,10.000},
				{16492.663,1050.488,10.000},
				{16597.712,1050.488,10.000},
				{16702.761,1050.488,10.000},
				{16807.810,1050.488,10.000},
				{16912.858,1050.488,10.000},
				{17017.907,1050.488,10.000},
				{17122.956,1050.488,10.000},
				{17228.005,1050.488,10.000},
				{17333.054,1050.488,10.000},
				{17438.103,1050.488,10.000},
				{17543.151,1050.488,10.000},
				{17648.200,1050.488,10.000},
				{17753.249,1050.488,10.000},
				{17858.298,1050.488,10.000},
				{17963.347,1050.488,10.000},
				{18068.395,1050.488,10.000},
				{18173.444,1050.488,10.000},
				{18278.493,1050.488,10.000},
				{18383.542,1050.488,10.000},
				{18488.591,1050.488,10.000},
				{18593.639,1050.488,10.000},
				{18698.688,1050.488,10.000},
				{18803.737,1050.488,10.000},
				{18908.786,1050.488,10.000},
				{19013.835,1050.488,10.000},
				{19118.884,1050.488,10.000},
				{19223.932,1050.488,10.000},
				{19328.981,1050.488,10.000},
				{19434.030,1050.488,10.000},
				{19539.079,1050.488,10.000},
				{19644.128,1050.488,10.000},
				{19749.176,1050.488,10.000},
				{19854.225,1050.488,10.000},
				{19959.274,1050.488,10.000},
				{20064.323,1050.488,10.000},
				{20169.372,1050.488,10.000},
				{20274.420,1050.488,10.000},
				{20379.469,1050.488,10.000},
				{20484.518,1050.488,10.000},
				{20589.567,1050.488,10.000},
				{20694.616,1050.488,10.000},
				{20799.664,1050.488,10.000},
				{20904.713,1050.488,10.000},
				{21009.762,1050.488,10.000},
				{21114.811,1050.488,10.000},
				{21219.860,1050.488,10.000},
				{21324.909,1050.488,10.000},
				{21429.957,1050.488,10.000},
				{21535.006,1050.488,10.000},
				{21640.055,1050.488,10.000},
				{21745.104,1050.488,10.000},
				{21850.153,1050.488,10.000},
				{21955.201,1050.488,10.000},
				{22060.250,1050.488,10.000},
				{22165.299,1050.488,10.000},
				{22270.348,1050.488,10.000},
				{22375.397,1050.488,10.000},
				{22480.445,1050.488,10.000},
				{22585.494,1050.488,10.000},
				{22690.543,1050.488,10.000},
				{22795.592,1050.488,10.000},
				{22900.641,1050.488,10.000},
				{23005.690,1050.488,10.000},
				{23110.738,1050.488,10.000},
				{23215.787,1050.488,10.000},
				{23320.836,1050.488,10.000},
				{23425.808,1049.716,10.000},
				{23530.547,1047.398,10.000},
				{23634.901,1043.536,10.000},
				{23738.714,1038.129,10.000},
				{23841.832,1031.178,10.000},
				{23944.100,1022.681,10.000},
				{24045.364,1012.640,10.000},
				{24145.469,1001.053,10.000},
				{24244.261,987.922,10.000},
				{24341.586,973.246,10.000},
				{24437.289,957.026,10.000},
				{24531.215,939.260,10.000},
				{24623.209,919.950,10.000},
				{24713.119,899.094,10.000},
				{24800.788,876.694,10.000},
				{24886.063,852.749,10.000},
				{24968.789,827.259,10.000},
				{25048.889,800.997,10.000},
				{25126.362,774.735,10.000},
				{25201.210,748.473,10.000},
				{25273.431,722.211,10.000},
				{25343.026,695.948,10.000},
				{25409.994,669.686,10.000},
				{25474.337,643.424,10.000},
				{25536.053,617.162,10.000},
				{25595.143,590.900,10.000},
				{25651.606,564.637,10.000},
				{25705.444,538.375,10.000},
				{25756.655,512.113,10.000},
				{25805.240,485.851,10.000},
				{25851.199,459.589,10.000},
				{25894.532,433.326,10.000},
				{25935.238,407.064,10.000},
				{25973.318,380.802,10.000},
				{26008.772,354.540,10.000},
				{26041.600,328.278,10.000},
				{26071.802,302.015,10.000},
				{26099.377,275.753,10.000},
				{26124.326,249.491,10.000},
				{26146.649,223.229,10.000},
				{26166.423,197.739,10.000},
				{26183.802,173.794,10.000},
				{26198.942,151.394,10.000},
				{26211.995,130.539,10.000},
				{26223.118,111.228,10.000},
				{26232.465,93.463,10.000},
				{26240.189,77.242,10.000},
				{26246.445,62.566,10.000},
				{26251.389,49.435,10.000},
				{26255.174,37.848,10.000},
				{26257.954,27.807,10.000},
				{26259.885,19.310,10.000},
				{26261.121,12.359,10.000},
				{26261.816,6.952,10.000},
				{26262.125,3.090,10.000},
				{26262.203,0.772,10.000},
				{26262.203,0.000,10.000}
		};
		
		this.leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
		this.rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
	}

}