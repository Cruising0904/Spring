package test.sp.iot.anno4;

import java.util.List;

import org.springframework.stereotype.Service;

public interface BallGame {

	public String checkNum(List<Integer> numList);
	public void makeBallNum();
	public void printBallNum();
	public boolean getCheck();
}
