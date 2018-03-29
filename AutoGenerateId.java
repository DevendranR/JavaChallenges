package test;
import java.util.UUID;

public class AutoGenerateId {
	private static final char[] CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	public static String generateID(){
		UUID uuid = UUID.randomUUID();
		   
	    StringBuilder buff = new StringBuilder(32);
	      long2string(uuid.getMostSignificantBits(), buff);
	      long2string(uuid.getLeastSignificantBits(), buff);
	
	      return buff.toString();
	}
	private static void long2string(long l, StringBuilder buff) {
		for (int i = 0; i < 16; ++i) {
			long nextByte = l & -1152921504606846976L;
			l <<= 4;
			boolean isNegative = nextByte < 0L;
			nextByte = rightShift(nextByte, 60);
	
			if (isNegative) {
				nextByte |= 8L;
			}
	
			buff.append(CHARS[(int) nextByte]);
		}
	}

	private static long rightShift(long l, int n) {
		return l >>> n;
	}
}
