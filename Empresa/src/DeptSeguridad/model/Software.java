package DeptSeguridad.model;

public class Software {

		private String lenguajeSoftware;
		private int cantCompu;
		
		/**
		 * @param lenguajeSoftware
		 * @param cantCompu
		 */
		public Software(String lenguajeSoftware, int cantCompu) {
			this.lenguajeSoftware = lenguajeSoftware;
			this.cantCompu = cantCompu;
		}
		/**
		 * @return the lenguajeSoftware
		 */
		public String getLenguajeSoftware() {
			return lenguajeSoftware;
		}
		/**
		 * @param lenguajeSoftware the lenguajeSoftware to set
		 */
		public void setLenguajeSoftware(String lenguajeSoftware) {
			this.lenguajeSoftware = lenguajeSoftware;
		}
		/**
		 * @return the cantCompu
		 */
		public int getCantCompu() {
			return cantCompu;
		}
		/**
		 * @param cantCompu the cantCompu to set
		 */
		public void setCantCompu(int cantCompu) {
			this.cantCompu = cantCompu;
		}
		
}
