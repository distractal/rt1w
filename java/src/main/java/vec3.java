import java.lang.Math;

public class vec3 {
	public vec3() {}
	public vec3(double v0, double v1, double v2) { 
		v[0] = v0;
		v[1] = v1;
		v[2] = v2;
		//return this;
	}
	public final double x() { return v[0]; }
	public final double y() { return v[1]; }
	public final double z() { return v[2]; }
	public final double r() { return v[0]; }
	public final double g() { return v[1]; }
	public final double b() { return v[2]; }
	public final void setx(double in) { v[0] = in; }
	public final void sety(double in) { v[1] = in; }
	public final void setz(double in) { v[2] = in; }

	public final double length() { return Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] + v[2]); }
	public final double squared_length() { return v[0] * v[0] + v[1] * v[1] + v[2] + v[2]; }

	public double[] v = new double[3];
}

