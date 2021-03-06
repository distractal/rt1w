import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class RayTracer {
	
	public static vec3 color(ray r) {
		vec3 unitDirection = new vec3();
		unitDirection = vec3math.unitVector(r.direction());
		return unitDirection;
	}	

	public static void main(String[] args) {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.ppm"));

			int nx = 200;
			int ny = 100;
			writer.write("P3\n" + nx + " " + ny + "\n255\n");
			for (int j = ny - 1; j >= 0; j--) {
				for (int i = 0; i < nx; i++) {
					vec3 col = new vec3((double)i / (double)nx, (double)j / (double)ny, 0.2);
					double r = (double)i / (double)nx;
					double g = (double)j / (double)ny;
					double b = 0.2;
					int ir = (int)(255.99 * r);
					int ig = (int)(255.99 * g);
					int ib = (int)(255.99 * b);
					writer.write(ir + " " + ig + " " + ib + "\n");
				}			
			}
		writer.close();
		}

		catch(IOException e) {
			e.printStackTrace();
		}

	}
}