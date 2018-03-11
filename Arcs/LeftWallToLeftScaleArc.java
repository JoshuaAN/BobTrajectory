package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToLeftScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.15,0.00)
	// (13.63,23.15,0.00)
	// (24.13,19.15,-15.00)
	
    public LeftWallToLeftScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToLeftScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.445,-8.895,10.000,0.000},
				{-2.224,-17.789,10.000,0.000},
				{-6.226,-40.025,10.000,0.000},
				{-13.342,-71.156,10.000,0.000},
				{-24.460,-111.181,10.000,0.000},
				{-40.470,-160.101,10.000,0.000},
				{-62.262,-217.915,10.000,0.000},
				{-90.724,-284.624,10.000,0.000},
				{-126.747,-360.227,10.000,0.000},
				{-171.219,-444.725,10.000,0.000},
				{-225.031,-538.118,10.000,0.000},
				{-289.071,-640.404,10.000,0.000},
				{-364.230,-751.586,10.000,0.000},
				{-451.396,-871.662,10.000,0.000},
				{-551.459,-1000.632,10.000,0.000},
				{-665.309,-1138.497,10.000,0.000},
				{-793.835,-1285.256,10.000,0.000},
				{-937.926,-1440.910,10.000,0.000},
				{-1098.471,-1605.458,10.000,0.000},
				{-1276.361,-1778.901,10.000,0.000},
				{-1472.041,-1956.791,10.000,0.000},
				{-1685.509,-2134.681,10.000,0.000},
				{-1916.766,-2312.571,10.000,0.000},
				{-2165.812,-2490.461,10.000,0.000},
				{-2432.647,-2668.352,10.000,0.000},
				{-2717.271,-2846.242,10.000,0.000},
				{-3019.684,-3024.132,10.000,0.000},
				{-3339.887,-3202.022,10.000,0.000},
				{-3677.878,-3379.912,10.000,0.000},
				{-4033.658,-3557.802,10.000,0.000},
				{-4407.227,-3735.692,10.000,0.000},
				{-4798.586,-3913.582,10.000,0.000},
				{-5207.733,-4091.472,10.000,0.000},
				{-5634.669,-4269.362,10.000,0.000},
				{-6079.394,-4447.253,10.000,0.000},
				{-6541.909,-4625.143,10.000,0.000},
				{-7022.212,-4803.033,10.000,0.000},
				{-7520.304,-4980.923,10.000,0.000},
				{-8036.185,-5158.813,10.000,0.000},
				{-8569.856,-5336.703,10.000,0.000},
				{-9121.315,-5514.593,10.000,0.000},
				{-9690.563,-5692.483,10.000,0.000},
				{-10277.601,-5870.373,10.000,0.000},
				{-10882.427,-6048.263,10.000,0.000},
				{-11505.042,-6226.154,10.000,0.000},
				{-12145.447,-6404.044,10.000,0.000},
				{-12803.640,-6581.934,10.000,0.000},
				{-13479.623,-6759.824,10.000,0.000},
				{-14173.394,-6937.714,10.000,0.000},
				{-14884.954,-7115.604,10.000,0.000},
				{-15613.859,-7289.047,10.000,0.000},
				{-16359.219,-7453.595,10.000,0.000},
				{-17120.143,-7609.249,10.000,0.000},
				{-17895.744,-7756.008,10.000,0.000},
				{-18685.132,-7893.873,10.000,0.000},
				{-19487.416,-8022.844,10.000,0.000},
				{-20301.708,-8142.919,10.000,0.000},
				{-21127.118,-8254.101,10.000,0.000},
				{-21962.757,-8356.388,10.000,0.000},
				{-22807.735,-8449.780,10.000,0.000},
				{-23661.163,-8534.278,10.000,0.000},
				{-24522.151,-8609.881,10.000,0.000},
				{-25389.810,-8676.590,10.000,0.000},
				{-26263.250,-8734.404,10.000,0.000},
				{-27141.582,-8783.324,10.000,0.000},
				{-28023.917,-8823.349,10.000,0.000},
				{-28909.365,-8854.480,10.000,0.000},
				{-29797.037,-8876.716,10.000,0.000},
				{-30686.043,-8890.058,10.000,0.000},
				{-31575.493,-8894.505,10.000,0.000},
				{-32464.944,-8894.505,10.000,0.000},
				{-33354.394,-8894.505,10.000,0.000},
				{-34243.845,-8894.505,10.000,0.000},
				{-35133.295,-8894.505,10.000,0.000},
				{-36022.746,-8894.505,10.000,0.000},
				{-36912.196,-8894.505,10.000,0.000},
				{-37801.647,-8894.505,10.000,0.000},
				{-38691.097,-8894.505,10.000,0.000},
				{-39580.548,-8894.505,10.000,0.000},
				{-40469.998,-8894.505,10.000,0.000},
				{-41359.449,-8894.505,10.000,0.000},
				{-42248.899,-8894.505,10.000,0.000},
				{-43138.350,-8894.505,10.000,0.000},
				{-44027.800,-8894.505,10.000,0.000},
				{-44917.251,-8894.505,10.000,0.000},
				{-45806.701,-8894.505,10.000,0.000},
				{-46696.152,-8894.505,10.000,0.000},
				{-47585.602,-8894.505,10.000,0.000},
				{-48475.053,-8894.505,10.000,0.000},
				{-49364.504,-8894.505,10.000,0.000},
				{-50253.954,-8894.505,10.000,0.000},
				{-51143.405,-8894.505,10.000,0.000},
				{-52032.855,-8894.505,10.000,0.000},
				{-52922.306,-8894.505,10.000,0.000},
				{-53811.756,-8894.505,10.000,0.000},
				{-54701.207,-8894.505,10.000,0.000},
				{-55590.657,-8894.505,10.000,0.000},
				{-56480.108,-8894.505,10.000,0.000},
				{-57369.558,-8894.505,10.000,0.000},
				{-58259.009,-8894.505,10.000,0.000},
				{-59148.459,-8894.505,10.000,0.000},
				{-60037.910,-8894.505,10.000,0.000},
				{-60927.360,-8894.505,10.000,0.000},
				{-61816.811,-8894.505,10.000,0.000},
				{-62706.261,-8894.505,10.000,0.000},
				{-63595.712,-8894.505,10.000,0.000},
				{-64485.162,-8894.505,10.000,0.000},
				{-65374.613,-8894.505,10.000,0.000},
				{-66264.063,-8894.505,10.000,0.000},
				{-67153.514,-8894.505,10.000,0.000},
				{-68042.964,-8894.505,10.000,0.000},
				{-68932.415,-8894.505,10.000,0.000},
				{-69821.865,-8894.505,10.000,0.000},
				{-70711.316,-8894.505,10.000,0.000},
				{-71600.766,-8894.505,10.000,0.000},
				{-72490.217,-8894.505,10.000,0.000},
				{-73379.667,-8894.505,10.000,0.000},
				{-74269.118,-8894.505,10.000,0.000},
				{-75158.568,-8894.505,10.000,0.000},
				{-76048.019,-8894.505,10.000,0.000},
				{-76937.469,-8894.505,10.000,0.000},
				{-77826.920,-8894.505,10.000,0.000},
				{-78716.370,-8894.505,10.000,0.000},
				{-79605.821,-8894.505,10.000,0.000},
				{-80495.272,-8894.505,10.000,0.000},
				{-81384.722,-8894.505,10.000,0.000},
				{-82274.173,-8894.505,10.000,0.000},
				{-83163.623,-8894.505,10.000,0.000},
				{-84053.074,-8894.505,10.000,0.000},
				{-84942.524,-8894.505,10.000,0.000},
				{-85831.975,-8894.505,10.000,0.000},
				{-86721.425,-8894.505,10.000,0.000},
				{-87610.876,-8894.505,10.000,0.000},
				{-88500.326,-8894.505,10.000,0.000},
				{-89389.777,-8894.505,10.000,0.000},
				{-90279.227,-8894.505,10.000,0.000},
				{-91168.678,-8894.505,10.000,0.000},
				{-92058.128,-8894.505,10.000,0.000},
				{-92947.579,-8894.505,10.000,0.000},
				{-93837.029,-8894.505,10.000,0.000},
				{-94726.480,-8894.505,10.000,0.000},
				{-95615.930,-8894.505,10.000,0.000},
				{-96505.381,-8894.505,10.000,0.000},
				{-97394.831,-8894.505,10.000,0.000},
				{-98284.282,-8894.505,10.000,0.000},
				{-99173.732,-8894.505,10.000,0.000},
				{-100063.183,-8894.505,10.000,0.000},
				{-100952.633,-8894.505,10.000,0.000},
				{-101842.084,-8894.505,10.000,0.000},
				{-102731.534,-8894.505,10.000,0.000},
				{-103620.985,-8894.505,10.000,0.000},
				{-104510.435,-8894.505,10.000,0.000},
				{-105399.886,-8894.505,10.000,0.000},
				{-106289.336,-8894.505,10.000,0.000},
				{-107178.787,-8894.505,10.000,0.000},
				{-108068.237,-8894.505,10.000,0.000},
				{-108957.688,-8894.505,10.000,0.000},
				{-109847.138,-8894.505,10.000,0.000},
				{-110736.589,-8894.505,10.000,0.000},
				{-111626.039,-8894.505,10.000,0.000},
				{-112515.490,-8894.505,10.000,0.000},
				{-113404.941,-8894.505,10.000,0.000},
				{-114294.391,-8894.505,10.000,0.000},
				{-115183.842,-8894.505,10.000,0.000},
				{-116073.292,-8894.505,10.000,0.000},
				{-116962.743,-8894.505,10.000,0.000},
				{-117852.193,-8894.505,10.000,0.000},
				{-118741.644,-8894.505,10.000,0.000},
				{-119631.094,-8894.505,10.000,0.000},
				{-120520.545,-8894.505,10.000,0.000},
				{-121409.995,-8894.505,10.000,0.000},
				{-122299.446,-8894.505,10.000,0.000},
				{-123188.896,-8894.505,10.000,0.000},
				{-124078.347,-8894.505,10.000,0.000},
				{-124967.797,-8894.505,10.000,0.000},
				{-125857.248,-8894.505,10.000,0.000},
				{-126746.698,-8894.505,10.000,0.000},
				{-127636.149,-8894.505,10.000,0.000},
				{-128525.599,-8894.505,10.000,0.000},
				{-129415.050,-8894.505,10.000,0.000},
				{-130304.500,-8894.505,10.000,0.000},
				{-131193.951,-8894.505,10.000,0.000},
				{-132083.401,-8894.505,10.000,0.000},
				{-132972.852,-8894.505,10.000,0.000},
				{-133862.302,-8894.505,10.000,0.000},
				{-134751.753,-8894.505,10.000,0.000},
				{-135641.203,-8894.505,10.000,0.000},
				{-136530.654,-8894.505,10.000,0.000},
				{-137420.104,-8894.505,10.000,0.000},
				{-138309.555,-8894.505,10.000,0.000},
				{-139199.005,-8894.505,10.000,0.000},
				{-140088.456,-8894.505,10.000,0.000},
				{-140977.906,-8894.505,10.000,0.000},
				{-141867.357,-8894.505,10.000,0.000},
				{-142756.807,-8894.505,10.000,0.000},
				{-143646.258,-8894.505,10.000,0.000},
				{-144535.708,-8894.505,10.000,0.000},
				{-145425.159,-8894.505,10.000,0.000},
				{-146314.610,-8894.505,10.000,0.000},
				{-147204.060,-8894.505,10.000,0.000},
				{-148093.511,-8894.505,10.000,0.000},
				{-148982.961,-8894.505,10.000,0.000},
				{-149872.412,-8894.505,10.000,0.000},
				{-150761.862,-8894.505,10.000,0.000},
				{-151651.313,-8894.505,10.000,0.000},
				{-152540.763,-8894.505,10.000,0.000},
				{-153430.214,-8894.505,10.000,0.000},
				{-154319.664,-8894.505,10.000,0.000},
				{-155209.115,-8894.505,10.000,0.000},
				{-156098.565,-8894.505,10.000,0.000},
				{-156988.016,-8894.505,10.000,0.000},
				{-157877.466,-8894.505,10.000,0.000},
				{-158766.917,-8894.505,10.000,0.000},
				{-159656.367,-8894.505,10.000,0.000},
				{-160545.818,-8894.505,10.000,0.000},
				{-161435.268,-8894.505,10.000,0.000},
				{-162324.719,-8894.505,10.000,0.000},
				{-163214.169,-8894.505,10.000,0.000},
				{-164103.620,-8894.505,10.000,0.000},
				{-164993.070,-8894.505,10.000,0.000},
				{-165882.521,-8894.505,10.000,0.000},
				{-166771.971,-8894.505,10.000,0.000},
				{-167661.422,-8894.505,10.000,0.000},
				{-168550.872,-8894.505,10.000,0.000},
				{-169440.323,-8894.505,10.000,0.000},
				{-170329.773,-8894.505,10.000,0.000},
				{-171219.224,-8894.505,10.000,0.000},
				{-172108.674,-8894.505,10.000,0.000},
				{-172998.125,-8894.505,10.000,0.000},
				{-173887.575,-8894.505,10.000,0.000},
				{-174777.026,-8894.505,10.000,0.000},
				{-175666.476,-8894.505,10.000,0.000},
				{-176555.927,-8894.505,10.000,0.000},
				{-177445.378,-8894.505,10.000,0.000},
				{-178334.193,-8888.153,10.000,-0.003},
				{-179218.613,-8844.204,10.000,-0.022},
				{-180098.132,-8795.189,10.000,-0.062},
				{-180972.877,-8747.447,10.000,-0.120},
				{-181842.968,-8700.911,10.000,-0.196},
				{-182708.520,-8655.522,10.000,-0.290},
				{-183569.643,-8611.226,10.000,-0.402},
				{-184426.440,-8567.972,10.000,-0.531},
				{-185279.012,-8525.717,10.000,-0.677},
				{-186127.454,-8484.424,10.000,-0.839},
				{-186971.860,-8444.058,10.000,-1.016},
				{-187812.319,-8404.590,10.000,-1.210},
				{-188648.918,-8365.997,10.000,-1.418},
				{-189481.744,-8328.258,10.000,-1.642},
				{-190310.880,-8291.358,10.000,-1.880},
				{-191136.409,-8255.286,10.000,-2.132},
				{-191958.412,-8220.033,10.000,-2.398},
				{-192776.972,-8185.596,10.000,-2.678},
				{-193592.169,-8151.975,10.000,-2.971},
				{-194404.086,-8119.172,10.000,-3.277},
				{-195212.806,-8087.196,10.000,-3.596},
				{-196018.411,-8056.054,10.000,-3.927},
				{-196820.987,-8025.759,10.000,-4.270},
				{-197620.620,-7996.328,10.000,-4.624},
				{-198417.397,-7967.776,10.000,-4.990},
				{-199211.410,-7940.124,10.000,-5.367},
				{-200002.749,-7913.395,10.000,-5.754},
				{-200791.510,-7887.610,10.000,-6.152},
				{-201577.790,-7862.797,10.000,-6.559},
				{-202361.688,-7838.981,10.000,-6.976},
				{-203143.307,-7816.189,10.000,-7.401},
				{-203922.752,-7794.451,10.000,-7.835},
				{-204700.132,-7773.793,10.000,-8.278},
				{-205475.556,-7754.246,10.000,-8.728},
				{-206249.140,-7735.837,10.000,-9.185},
				{-207020.999,-7718.594,10.000,-9.649},
				{-207791.254,-7702.544,10.000,-10.120},
				{-208560.025,-7687.713,10.000,-10.596},
				{-209327.438,-7674.126,10.000,-11.078},
				{-210093.618,-7661.804,10.000,-11.564},
				{-210858.695,-7650.768,10.000,-12.055},
				{-211622.799,-7641.038,10.000,-12.550},
				{-212386.061,-7632.627,10.000,-13.048},
				{-213148.616,-7625.550,10.000,-13.549},
				{-213910.598,-7619.817,10.000,-14.052},
				{-214672.141,-7615.433,10.000,-14.557},
				{-215433.382,-7612.403,10.000,-15.063},
				{-216194.454,-7610.727,10.000,-15.570},
				{-216955.494,-7610.401,10.000,-16.077},
				{-217716.636,-7611.419,10.000,-16.583},
				{-218478.013,-7613.771,10.000,-17.089},
				{-219239.758,-7617.443,10.000,-17.593},
				{-220001.999,-7622.417,10.000,-18.095},
				{-220764.867,-7628.674,10.000,-18.595},
				{-221528.486,-7636.190,10.000,-19.091},
				{-222292.979,-7644.938,10.000,-19.584},
				{-223058.468,-7654.889,10.000,-20.074},
				{-223825.070,-7666.012,10.000,-20.559},
				{-224592.897,-7678.271,10.000,-21.039},
				{-225362.060,-7691.630,10.000,-21.514},
				{-226132.665,-7706.051,10.000,-21.983},
				{-226904.814,-7721.494,10.000,-22.446},
				{-227678.606,-7737.917,10.000,-22.902},
				{-228454.134,-7755.278,10.000,-23.352},
				{-229231.487,-7773.532,10.000,-23.794},
				{-230010.751,-7792.637,10.000,-24.229},
				{-230792.005,-7812.548,10.000,-24.656},
				{-231575.328,-7833.220,10.000,-25.075},
				{-232360.788,-7854.609,10.000,-25.486},
				{-233148.456,-7876.672,10.000,-25.887},
				{-233938.392,-7899.363,10.000,-26.280},
				{-234730.656,-7922.641,10.000,-26.664},
				{-235525.302,-7946.464,10.000,-27.038},
				{-236322.382,-7970.791,10.000,-27.403},
				{-237121.940,-7995.583,10.000,-27.758},
				{-237924.020,-8020.800,10.000,-28.102},
				{-238728.661,-8046.406,10.000,-28.437},
				{-239535.897,-8072.366,10.000,-28.762},
				{-240345.762,-8098.644,10.000,-29.076},
				{-241158.282,-8125.209,10.000,-29.379},
				{-241973.485,-8152.030,10.000,-29.673},
				{-242791.393,-8179.077,10.000,-29.955},
				{-243612.025,-8206.323,10.000,-30.227},
				{-244435.400,-8233.741,10.000,-30.487},
				{-245261.530,-8261.306,10.000,-30.737},
				{-246090.430,-8288.996,10.000,-30.976},
				{-246922.109,-8316.789,10.000,-31.204},
				{-247756.575,-8344.664,10.000,-31.421},
				{-248593.835,-8372.603,10.000,-31.627},
				{-249433.894,-8400.589,10.000,-31.822},
				{-250276.755,-8428.605,10.000,-32.006},
				{-251122.418,-8456.636,10.000,-32.179},
				{-251970.885,-8484.668,10.000,-32.341},
				{-252822.154,-8512.689,10.000,-32.492},
				{-253676.223,-8540.686,10.000,-32.631},
				{-254533.087,-8568.649,10.000,-32.760},
				{-255392.744,-8596.568,10.000,-32.878},
				{-256255.188,-8624.433,10.000,-32.984},
				{-257120.411,-8652.235,10.000,-33.080},
				{-257988.408,-8679.967,10.000,-33.164},
				{-258859.170,-8707.619,10.000,-33.238},
				{-259732.688,-8735.187,10.000,-33.301},
				{-260608.954,-8762.661,10.000,-33.353},
				{-261487.958,-8790.036,10.000,-33.394},
				{-262369.689,-8817.305,10.000,-33.425},
				{-263254.135,-8844.462,10.000,-33.445},
				{-264141.285,-8871.500,10.000,-33.454},
				{-265031.126,-8898.413,10.000,-33.452},
				{-265923.646,-8925.195,10.000,-33.440},
				{-266818.829,-8951.837,10.000,-33.417},
				{-267716.663,-8978.334,10.000,-33.384},
				{-268617.131,-9004.679,10.000,-33.341},
				{-269520.217,-9030.862,10.000,-33.287},
				{-270425.905,-9056.876,10.000,-33.223},
				{-271334.176,-9082.713,10.000,-33.149},
				{-272245.012,-9108.362,10.000,-33.064},
				{-273158.393,-9133.814,10.000,-32.970},
				{-274074.299,-9159.058,10.000,-32.865},
				{-274992.708,-9184.082,10.000,-32.751},
				{-275913.595,-9208.875,10.000,-32.627},
				{-276836.937,-9233.422,10.000,-32.493},
				{-277762.708,-9257.710,10.000,-32.350},
				{-278690.881,-9281.724,10.000,-32.197},
				{-279621.425,-9305.448,10.000,-32.035},
				{-280554.312,-9328.865,10.000,-31.863},
				{-281489.507,-9351.956,10.000,-31.683},
				{-282426.978,-9374.702,10.000,-31.493},
				{-283366.686,-9397.084,10.000,-31.295},
				{-284308.594,-9419.080,10.000,-31.088},
				{-285252.661,-9440.668,10.000,-30.872},
				{-286198.843,-9461.825,10.000,-30.648},
				{-287147.096,-9482.525,10.000,-30.416},
				{-288097.370,-9502.743,10.000,-30.176},
				{-289049.616,-9522.454,10.000,-29.928},
				{-290003.779,-9541.629,10.000,-29.673},
				{-290959.803,-9560.240,10.000,-29.410},
				{-291917.628,-9578.258,10.000,-29.140},
				{-292877.194,-9595.652,10.000,-28.863},
				{-293838.433,-9612.393,10.000,-28.580},
				{-294801.278,-9628.448,10.000,-28.290},
				{-295765.656,-9643.786,10.000,-27.994},
				{-296731.494,-9658.374,10.000,-27.693},
				{-297698.712,-9672.179,10.000,-27.386},
				{-298667.229,-9685.169,10.000,-27.074},
				{-299636.959,-9697.309,10.000,-26.757},
				{-300607.816,-9708.568,10.000,-26.436},
				{-301579.707,-9718.911,10.000,-26.110},
				{-302552.538,-9728.306,10.000,-25.781},
				{-303526.210,-9736.720,10.000,-25.449},
				{-304500.622,-9744.122,10.000,-25.113},
				{-305475.670,-9750.480,10.000,-24.775},
				{-306451.246,-9755.763,10.000,-24.435},
				{-307427.241,-9759.942,10.000,-24.094},
				{-308403.539,-9762.987,10.000,-23.751},
				{-309380.026,-9764.871,10.000,-23.407},
				{-310356.583,-9765.568,10.000,-23.063},
				{-311332.813,-9762.300,10.000,-22.720},
				{-312307.830,-9750.165,10.000,-22.377},
				{-313280.532,-9727.025,10.000,-22.037},
				{-314249.821,-9692.886,10.000,-21.699},
				{-315214.598,-9647.769,10.000,-21.365},
				{-316173.769,-9591.711,10.000,-21.035},
				{-317126.245,-9524.760,10.000,-20.710},
				{-318070.943,-9446.980,10.000,-20.391},
				{-319006.788,-9358.450,10.000,-20.079},
				{-319932.714,-9259.259,10.000,-19.774},
				{-320847.665,-9149.509,10.000,-19.477},
				{-321750.596,-9029.316,10.000,-19.188},
				{-322640.477,-8898.803,10.000,-18.909},
				{-323516.287,-8758.104,10.000,-18.639},
				{-324377.023,-8607.362,10.000,-18.380},
				{-325221.696,-8446.724,10.000,-18.131},
				{-326049.330,-8276.346,10.000,-17.893},
				{-326858.969,-8096.385,10.000,-17.666},
				{-327649.669,-7907.004,10.000,-17.451},
				{-328420.505,-7708.364,10.000,-17.247},
				{-329170.836,-7503.308,10.000,-17.054},
				{-329900.507,-7296.711,10.000,-16.873},
				{-330609.580,-7090.729,10.000,-16.702},
				{-331298.123,-6885.425,10.000,-16.543},
				{-331966.209,-6680.860,10.000,-16.394},
				{-332613.917,-6477.085,10.000,-16.256},
				{-333241.332,-6274.149,10.000,-16.127},
				{-333848.542,-6072.093,10.000,-16.008},
				{-334435.637,-5870.954,10.000,-15.898},
				{-335002.713,-5670.760,10.000,-15.796},
				{-335549.867,-5471.539,10.000,-15.704},
				{-336077.198,-5273.311,10.000,-15.619},
				{-336584.807,-5076.091,10.000,-15.542},
				{-337072.796,-4879.891,10.000,-15.472},
				{-337541.268,-4684.715,10.000,-15.409},
				{-337990.324,-4490.566,10.000,-15.352},
				{-338420.068,-4297.441,10.000,-15.301},
				{-338830.602,-4105.333,10.000,-15.256},
				{-339222.025,-3914.231,10.000,-15.216},
				{-339594.437,-3724.120,10.000,-15.181},
				{-339947.935,-3534.981,10.000,-15.151},
				{-340282.614,-3346.791,10.000,-15.124},
				{-340598.566,-3159.524,10.000,-15.102},
				{-340895.881,-2973.152,10.000,-15.082},
				{-341174.645,-2787.640,10.000,-15.066},
				{-341434.941,-2602.953,10.000,-15.052},
				{-341676.846,-2419.052,10.000,-15.040},
				{-341900.435,-2235.895,10.000,-15.031},
				{-342105.779,-2053.438,10.000,-15.024},
				{-342292.943,-1871.634,10.000,-15.018},
				{-342462.238,-1692.956,10.000,-15.013},
				{-342614.420,-1521.816,10.000,-15.009},
				{-342750.429,-1360.088,10.000,-15.007},
				{-342871.198,-1207.696,10.000,-15.005},
				{-342977.655,-1064.571,10.000,-15.003},
				{-343070.720,-930.651,10.000,-15.002},
				{-343151.308,-805.881,10.000,-15.001},
				{-343220.330,-690.212,10.000,-15.001},
				{-343278.690,-583.604,10.000,-15.000},
				{-343327.292,-486.019,10.000,-15.000},
				{-343367.034,-397.427,10.000,-15.000},
				{-343398.815,-317.802,10.000,-15.000},
				{-343423.527,-247.124,10.000,-15.000},
				{-343442.065,-185.378,10.000,-15.000},
				{-343455.320,-132.549,10.000,-15.000},
				{-343464.183,-88.629,10.000,-15.000},
				{-343469.544,-53.611,10.000,-15.000},
				{-343472.293,-27.492,10.000,-15.000},
				{-343473.320,-10.269,10.000,-15.000},
				{-343473.514,-1.941,10.000,-15.000},
				{-343473.514,-0.000,10.000,-15.000}		};

}