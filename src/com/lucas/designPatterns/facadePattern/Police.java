package com.lucas.designPatterns.facadePattern;


public class Police {

		
		/**
		 * ������Ҫ����ż���
		 */
		public void checkLetter(LetterProcess letterProcess){
			System.out.println("������Ҫ����ż�");
		}

		/**
		 * @uml.property  name="modenPostOffice"
		 * @uml.associationEnd  inverse="police:com.lucas.designPatterns.facadePattern.ModenPostOffice"
		 */
		private ModenPostOffice modenPostOffice;

		/**
		 * Getter of the property <tt>modenPostOffice</tt>
		 * @return  Returns the modenPostOffice.
		 * @uml.property  name="modenPostOffice"
		 */
		public ModenPostOffice getModenPostOffice() {
			return modenPostOffice;
		}

		/**
		 * Setter of the property <tt>modenPostOffice</tt>
		 * @param modenPostOffice  The modenPostOffice to set.
		 * @uml.property  name="modenPostOffice"
		 */
		public void setModenPostOffice(ModenPostOffice modenPostOffice) {
			this.modenPostOffice = modenPostOffice;
		}

}
