package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (-3.19,0.00,0.00)
	
	public CenterToRightSwitchPt4() {
		this(false);
	}
			
    public CenterToRightSwitchPt4(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{-0.565,-11.306,10.000},
				{-2.826,-22.611,10.000},
				{-7.914,-50.876,10.000},
				{-16.959,-90.445,10.000},
				{-31.091,-141.321,10.000},
				{-51.441,-203.502,10.000},
				{-79.140,-276.989,10.000},
				{-115.318,-361.782,10.000},
				{-161.106,-457.880,10.000},
				{-217.634,-565.284,10.000},
				{-286.034,-683.993,10.000},
				{-367.434,-814.009,10.000},
				{-462.967,-955.330,10.000},
				{-573.763,-1107.956,10.000},
				{-700.387,-1266.236,10.000},
				{-842.838,-1424.515,10.000},
				{-1001.118,-1582.795,10.000},
				{-1175.225,-1741.074,10.000},
				{-1365.160,-1899.354,10.000},
				{-1570.924,-2057.633,10.000},
				{-1792.515,-2215.913,10.000},
				{-2029.934,-2374.192,10.000},
				{-2283.181,-2532.472,10.000},
				{-2552.257,-2690.751,10.000},
				{-2837.160,-2849.031,10.000},
				{-3137.891,-3007.310,10.000},
				{-3454.450,-3165.590,10.000},
				{-3786.836,-3323.869,10.000},
				{-4135.051,-3482.148,10.000},
				{-4499.094,-3640.428,10.000},
				{-4878.965,-3798.707,10.000},
				{-5274.664,-3956.987,10.000},
				{-5686.190,-4115.266,10.000},
				{-6113.545,-4273.546,10.000},
				{-6556.727,-4431.825,10.000},
				{-7015.738,-4590.105,10.000},
				{-7490.576,-4748.384,10.000},
				{-7981.243,-4906.664,10.000},
				{-8487.737,-5064.943,10.000},
				{-9010.059,-5223.223,10.000},
				{-9548.209,-5381.502,10.000},
				{-10102.188,-5539.782,10.000},
				{-10671.994,-5698.061,10.000},
				{-11257.628,-5856.341,10.000},
				{-11859.090,-6014.620,10.000},
				{-12476.380,-6172.900,10.000},
				{-13109.498,-6331.179,10.000},
				{-13758.443,-6489.458,10.000},
				{-14423.217,-6647.738,10.000},
				{-15103.819,-6806.017,10.000},
				{-15800.249,-6964.297,10.000},
				{-16512.506,-7122.576,10.000},
				{-17240.592,-7280.856,10.000},
				{-17984.505,-7439.135,10.000},
				{-18744.247,-7597.415,10.000},
				{-19519.816,-7755.694,10.000},
				{-20311.214,-7913.974,10.000},
				{-21117.874,-8066.600,10.000},
				{-21938.666,-8207.921,10.000},
				{-22772.459,-8337.937,10.000},
				{-23618.124,-8456.646,10.000},
				{-24474.529,-8564.050,10.000},
				{-25340.544,-8660.148,10.000},
				{-26215.038,-8744.941,10.000},
				{-27096.881,-8818.428,10.000},
				{-27984.942,-8880.609,10.000},
				{-28878.090,-8931.485,10.000},
				{-29775.196,-8971.055,10.000},
				{-30675.128,-8999.319,10.000},
				{-31576.755,-9016.277,10.000},
				{-32478.476,-9017.206,10.000},
				{-33378.686,-9002.104,10.000},
				{-34276.256,-8975.697,10.000},
				{-35170.054,-8937.984,10.000},
				{-36058.951,-8888.966,10.000},
				{-36941.815,-8828.642,10.000},
				{-37817.516,-8757.012,10.000},
				{-38684.924,-8674.077,10.000},
				{-39542.908,-8579.835,10.000},
				{-40390.337,-8474.288,10.000},
				{-41226.080,-8357.436,10.000},
				{-42049.008,-8229.278,10.000},
				{-42857.989,-8089.814,10.000},
				{-43651.894,-7939.044,10.000},
				{-44430.063,-7781.693,10.000},
				{-45192.404,-7623.414,10.000},
				{-45938.918,-7465.134,10.000},
				{-46669.603,-7306.855,10.000},
				{-47384.461,-7148.575,10.000},
				{-48083.491,-6990.296,10.000},
				{-48766.692,-6832.017,10.000},
				{-49434.066,-6673.737,10.000},
				{-50085.612,-6515.458,10.000},
				{-50721.329,-6357.178,10.000},
				{-51341.219,-6198.899,10.000},
				{-51945.281,-6040.619,10.000},
				{-52533.515,-5882.340,10.000},
				{-53105.921,-5724.060,10.000},
				{-53662.499,-5565.781,10.000},
				{-54203.249,-5407.501,10.000},
				{-54728.172,-5249.222,10.000},
				{-55237.266,-5090.942,10.000},
				{-55730.532,-4932.663,10.000},
				{-56207.970,-4774.383,10.000},
				{-56669.581,-4616.104,10.000},
				{-57115.363,-4457.824,10.000},
				{-57545.318,-4299.545,10.000},
				{-57959.444,-4141.265,10.000},
				{-58357.743,-3982.986,10.000},
				{-58740.214,-3824.706,10.000},
				{-59106.856,-3666.427,10.000},
				{-59457.671,-3508.148,10.000},
				{-59792.658,-3349.868,10.000},
				{-60111.817,-3191.589,10.000},
				{-60415.148,-3033.309,10.000},
				{-60702.651,-2875.030,10.000},
				{-60974.326,-2716.750,10.000},
				{-61230.173,-2558.471,10.000},
				{-61470.192,-2400.191,10.000},
				{-61694.383,-2241.912,10.000},
				{-61902.746,-2083.632,10.000},
				{-62095.281,-1925.353,10.000},
				{-62271.989,-1767.073,10.000},
				{-62432.868,-1608.794,10.000},
				{-62577.920,-1450.514,10.000},
				{-62707.143,-1292.235,10.000},
				{-62820.539,-1133.955,10.000},
				{-62918.579,-980.400,10.000},
				{-63002.301,-837.222,10.000},
				{-63072.836,-705.350,10.000},
				{-63131.314,-584.783,10.000},
				{-63178.866,-475.522,10.000},
				{-63216.623,-377.567,10.000},
				{-63245.715,-290.917,10.000},
				{-63267.272,-215.573,10.000},
				{-63282.426,-151.535,10.000},
				{-63292.306,-98.802,10.000},
				{-63298.043,-57.375,10.000},
				{-63300.769,-27.254,10.000},
				{-63301.613,-8.438,10.000},
				{-63301.705,-0.929,10.000},
				{-63301.705,-0.000,10.000}
		};
		
		double[][] rightPoints = {
				{-0.565,-11.306,10.000},
				{-2.826,-22.611,10.000},
				{-7.914,-50.876,10.000},
				{-16.959,-90.445,10.000},
				{-31.091,-141.321,10.000},
				{-51.441,-203.502,10.000},
				{-79.140,-276.989,10.000},
				{-115.318,-361.782,10.000},
				{-161.106,-457.880,10.000},
				{-217.634,-565.284,10.000},
				{-286.034,-683.993,10.000},
				{-367.434,-814.009,10.000},
				{-462.967,-955.330,10.000},
				{-573.763,-1107.956,10.000},
				{-700.387,-1266.236,10.000},
				{-842.838,-1424.515,10.000},
				{-1001.118,-1582.795,10.000},
				{-1175.225,-1741.074,10.000},
				{-1365.160,-1899.354,10.000},
				{-1570.924,-2057.633,10.000},
				{-1792.515,-2215.913,10.000},
				{-2029.934,-2374.192,10.000},
				{-2283.181,-2532.472,10.000},
				{-2552.257,-2690.751,10.000},
				{-2837.160,-2849.031,10.000},
				{-3137.891,-3007.310,10.000},
				{-3454.450,-3165.590,10.000},
				{-3786.836,-3323.869,10.000},
				{-4135.051,-3482.148,10.000},
				{-4499.094,-3640.428,10.000},
				{-4878.965,-3798.707,10.000},
				{-5274.664,-3956.987,10.000},
				{-5686.190,-4115.266,10.000},
				{-6113.545,-4273.546,10.000},
				{-6556.727,-4431.825,10.000},
				{-7015.738,-4590.105,10.000},
				{-7490.576,-4748.384,10.000},
				{-7981.243,-4906.664,10.000},
				{-8487.737,-5064.943,10.000},
				{-9010.059,-5223.223,10.000},
				{-9548.209,-5381.502,10.000},
				{-10102.188,-5539.782,10.000},
				{-10671.994,-5698.061,10.000},
				{-11257.628,-5856.341,10.000},
				{-11859.090,-6014.620,10.000},
				{-12476.380,-6172.900,10.000},
				{-13109.498,-6331.179,10.000},
				{-13758.443,-6489.458,10.000},
				{-14423.217,-6647.738,10.000},
				{-15103.819,-6806.017,10.000},
				{-15800.249,-6964.297,10.000},
				{-16512.506,-7122.576,10.000},
				{-17240.592,-7280.856,10.000},
				{-17984.505,-7439.135,10.000},
				{-18744.247,-7597.415,10.000},
				{-19519.816,-7755.694,10.000},
				{-20311.214,-7913.974,10.000},
				{-21117.874,-8066.600,10.000},
				{-21938.666,-8207.921,10.000},
				{-22772.459,-8337.937,10.000},
				{-23618.124,-8456.646,10.000},
				{-24474.529,-8564.050,10.000},
				{-25340.544,-8660.148,10.000},
				{-26215.038,-8744.941,10.000},
				{-27096.881,-8818.428,10.000},
				{-27984.942,-8880.609,10.000},
				{-28878.090,-8931.485,10.000},
				{-29775.196,-8971.055,10.000},
				{-30675.128,-8999.319,10.000},
				{-31576.755,-9016.277,10.000},
				{-32478.476,-9017.206,10.000},
				{-33378.686,-9002.104,10.000},
				{-34276.256,-8975.697,10.000},
				{-35170.054,-8937.984,10.000},
				{-36058.951,-8888.966,10.000},
				{-36941.815,-8828.642,10.000},
				{-37817.516,-8757.012,10.000},
				{-38684.924,-8674.077,10.000},
				{-39542.908,-8579.835,10.000},
				{-40390.337,-8474.288,10.000},
				{-41226.080,-8357.436,10.000},
				{-42049.008,-8229.278,10.000},
				{-42857.989,-8089.814,10.000},
				{-43651.894,-7939.044,10.000},
				{-44430.063,-7781.693,10.000},
				{-45192.404,-7623.414,10.000},
				{-45938.918,-7465.134,10.000},
				{-46669.603,-7306.855,10.000},
				{-47384.461,-7148.575,10.000},
				{-48083.491,-6990.296,10.000},
				{-48766.692,-6832.017,10.000},
				{-49434.066,-6673.737,10.000},
				{-50085.612,-6515.458,10.000},
				{-50721.329,-6357.178,10.000},
				{-51341.219,-6198.899,10.000},
				{-51945.281,-6040.619,10.000},
				{-52533.515,-5882.340,10.000},
				{-53105.921,-5724.060,10.000},
				{-53662.499,-5565.781,10.000},
				{-54203.249,-5407.501,10.000},
				{-54728.172,-5249.222,10.000},
				{-55237.266,-5090.942,10.000},
				{-55730.532,-4932.663,10.000},
				{-56207.970,-4774.383,10.000},
				{-56669.581,-4616.104,10.000},
				{-57115.363,-4457.824,10.000},
				{-57545.318,-4299.545,10.000},
				{-57959.444,-4141.265,10.000},
				{-58357.743,-3982.986,10.000},
				{-58740.214,-3824.706,10.000},
				{-59106.856,-3666.427,10.000},
				{-59457.671,-3508.148,10.000},
				{-59792.658,-3349.868,10.000},
				{-60111.817,-3191.589,10.000},
				{-60415.148,-3033.309,10.000},
				{-60702.651,-2875.030,10.000},
				{-60974.326,-2716.750,10.000},
				{-61230.173,-2558.471,10.000},
				{-61470.192,-2400.191,10.000},
				{-61694.383,-2241.912,10.000},
				{-61902.746,-2083.632,10.000},
				{-62095.281,-1925.353,10.000},
				{-62271.989,-1767.073,10.000},
				{-62432.868,-1608.794,10.000},
				{-62577.920,-1450.514,10.000},
				{-62707.143,-1292.235,10.000},
				{-62820.539,-1133.955,10.000},
				{-62918.579,-980.400,10.000},
				{-63002.301,-837.222,10.000},
				{-63072.836,-705.350,10.000},
				{-63131.314,-584.783,10.000},
				{-63178.866,-475.522,10.000},
				{-63216.623,-377.567,10.000},
				{-63245.715,-290.917,10.000},
				{-63267.272,-215.573,10.000},
				{-63282.426,-151.535,10.000},
				{-63292.306,-98.802,10.000},
				{-63298.043,-57.375,10.000},
				{-63300.769,-27.254,10.000},
				{-63301.613,-8.438,10.000},
				{-63301.705,-0.929,10.000},
				{-63301.705,-0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}