package com.team254.lib.trajectory;

public class TrajectorySet {
    public Trajectory left;
    public Trajectory center;
    public Trajectory right;

    public TrajectorySet(Trajectory left, Trajectory center, Trajectory right) {
        this.left = left;
        this.center = center;
        this.right = right;
    }

    public String toString() {
		StringBuilder str = new StringBuilder("dt,x,y,left.pos,left.vel,left.acc,left.jerk,center.pos,center.vel,center.acc,center.jerk,right.pos,right.vel,right.acc,right.jerk,heading\n");
		for (int i = 0; i < center.getNumSegments(); ++i) {
			str.append(center.getSegmentDt(i)).append(",")
			.append(center.getSegmentX(i)).append(",")
			.append(center.getSegmentY(i)).append(",")
            		.append(left.getSegmentPos(i)).append(",")
            		.append(left.getSegmentVel(i)).append(",")
            		.append(left.getSegmentAcc(i)).append(",")
            		.append(left.getSegmentJerk(i)).append(",")
            		.append(center.getSegmentPos(i)).append(",")
            		.append(center.getSegmentVel(i)).append(",")
            		.append(center.getSegmentAcc(i)).append(",")
            		.append(center.getSegmentJerk(i)).append(",")
            		.append(right.getSegmentPos(i)).append(",")
            		.append(right.getSegmentVel(i)).append(",")
            		.append(right.getSegmentAcc(i)).append(",")
            		.append(right.getSegmentJerk(i)).append(",")
            		.append(center.getSegmentHeading(i))
			.append("\n");
		}

		return str.toString();
	}
}
