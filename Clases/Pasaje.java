public class Pasaje {
//Atributos
		private Micro micro;
		private Asiento butaca;
		private Pasajero pasajero;
		private boolean pago;
//Constructor
		public Pasaje(Micro micro, Asiento butaca, Pasajero pasajero, boolean pago) {
			super();
			this.micro = micro;
			this.butaca = butaca;
			this.pasajero = pasajero;
			this.pago = pago;
		}
//Metodos
		public Micro getMicro() {
			return micro;
		}
		public void setMicro(Micro micro) {
			this.micro = micro;
		}
		public Asiento getButaca() {
			return butaca;
		}
		public void setButaca(Asiento butaca) {
			this.butaca = butaca;
		}
		public Pasajero getPasajero() {
			return pasajero;
		}
		public void setPasajero(Pasajero pasajero) {
			this.pasajero = pasajero;
		}
		public boolean isPago() {
			return pago;
		}
		public void setPago(boolean pago) {
			this.pago = pago;
		}
		
}
