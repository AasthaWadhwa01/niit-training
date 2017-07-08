package generics;

class CallingTwoGenerics {

	public class BoxPrinter<T, V> {
		private T val;
		private V val2;
		public BoxPrinter(T arg, V arg2) {
			this.val = arg;
			this.val2 = arg2;
		}
		@Override
		public String toString() {
			return "BoxPrinter [val=" + val + ", val2=" + val2 + "]";
		}
		
	}


	}


