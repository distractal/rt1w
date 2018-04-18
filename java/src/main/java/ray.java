public class ray
{
	public ray() {}
	public ray(vec3 a, vec3 b) {
		A = a;
		B = b;
	}

	public final vec3 origin() { return A; }
	public final vec3 direction() { return B; }
	public final vec3 pointAtParameter(double t) { 
		vec3 multiplied = new vec3();
		vec3 returnVec = new vec3();
		vec3math.mulVec(t, B, multiplied);  // WHY CAN'T I OVERLOAD OPERATORS WAT
		vec3math.addVec(A, multiplied, returnVec);
		return returnVec;
	}

	vec3 A = new vec3();
	vec3 B = new vec3();
}