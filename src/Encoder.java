import java.util.BitSet;

public interface Encoder {
	
	BitSet compress(String input);
	
	String decompress(BitSet input);
	
	String getName();
	
}
