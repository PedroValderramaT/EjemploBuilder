public abstract class BebidaFria implements Item {

	@Override
	public Packing packing() {
       return new Botella();
	}

	@Override
	public abstract float precio();
}