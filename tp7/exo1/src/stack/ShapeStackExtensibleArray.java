package stack;

import shape.Shape;

public class ShapeStackExtensibleArray extends ShapeStackFixedSizeArray {

	@Override
	public void push(Shape shape) {
		if (this.nbElements == this.shapes.length) {
			Shape[] tmp = new Shape[this.shapes.length * 2 + 1];
			for (int i = 0; i < this.shapes.length; i++) {
				tmp[i] = this.shapes[i];
			}
			this.shapes = tmp;
		}
		this.shapes[this.nbElements++] = shape;
	}


}
