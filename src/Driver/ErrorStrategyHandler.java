package Driver;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ErrorStrategyHandler implements ANTLRErrorStrategy{

	@Override
	public boolean inErrorRecoveryMode(Parser arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recover(Parser arg0, RecognitionException arg1) throws RecognitionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Token recoverInline(Parser arg0) throws RecognitionException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reportError(Parser arg0, RecognitionException arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportMatch(Parser arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset(Parser arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sync(Parser arg0) throws RecognitionException {
		// TODO Auto-generated method stub
		
	}

}
