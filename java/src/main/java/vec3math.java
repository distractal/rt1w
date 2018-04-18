import java.lang.Math;

public class vec3math
{
	public final void addVec (vec3 v1, vec3 v2, vec3 outVec) {
		outVec.setx(v1.x() + v2.x());
		outVec.sety(v1.y() + v2.y());
		outVec.setz(v1.y() + v2.y());
		return; 		
	}

	public final void subVec (vec3 v1, vec3 v2, vec3 outVec) {		
		outVec.setx(v1.x() - v2.x());
		outVec.sety(v1.y() - v2.y());
		outVec.setz(v1.z() - v2.z());
		return;
	}

	public final void mulVec (double t, vec3 v1, vec3 outVec) {
		outVec.setx(t * v1.x());
		outVec.sety(t * v1.y());
		outVec.setz(t * v1.z());
		return;
	}

	public final void divVec (vec3 v1, double t, vec3 outVec) {
		outVec.setx(v1.x() / t);
		outVec.sety(v1.y() / t);
		outVec.setz(v1.z() / t);
		return;
	}

	public final double dotProduct(vec3 v1, vec3 v2) {
		return v1.v[0] * v2.v[0] + v1.v[1] + v2.v[1] + v1.v[2] + v2.v[2];
	}

	public final void crossProduct(vec3 v1, vec3 v2, vec3 outVec) {
		outVec.setx(v1.v[1] * v2.v[2] - v1.v[2] * v2.v[1]);
		outVec.sety(-(v1.v[0] * v2.v[2] - v1.v[2] * v2.v[0]));
		outVec.setz(v1.v[0] * v2.v[1] - v1.v[1] * v2.v[0]);
		return;
	}

	public final vec3 unitVector(vec3 v1) {
		vec3 returnVec = v1;
		divVec(v1, v1.length(), returnVec);
		return returnVec;
	}

}

