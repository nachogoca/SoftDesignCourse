package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BallTest {

    String BOUNCE_CRASH, BOUNCE_IRREGULAR_BOUNCE,BOUNCE_NORMAL_BOUNCE,
            DEFLATE_INFLATE, DEFLATE_DEFLATE, HEAVY_HIT, LIGHT_HIT,
            NORMAL_HIT, DEFLATE_NOT_INFLATE, ROLL, DEFLATE_NOT_DEFLATE ;

    @Before
    public void setUp()
    {
        ROLL = " is rolling!";
        
        BOUNCE_CRASH = "I crashed!! I can't bounce";
        BOUNCE_IRREGULAR_BOUNCE = "I'm bouncing irregularly!";
        BOUNCE_NORMAL_BOUNCE = "I'm bouncing normally!";

        DEFLATE_INFLATE = "I'm inflating!";
        DEFLATE_DEFLATE = "I'm deflating!";
        DEFLATE_NOT_INFLATE = "I can't inflate!";
        DEFLATE_NOT_DEFLATE = "I can't deflate!";
        
        HEAVY_HIT = "It is a heavy Hit! ouch!";
        LIGHT_HIT = "It is a light Hit";
        NORMAL_HIT =  "It is a normal Hit!";

    }
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        assertEquals(BOUNCE_IRREGULAR_BOUNCE, americanFootballBall.performBounce());
        assertEquals(DEFLATE_DEFLATE, americanFootballBall.performDeflate());
        assertEquals(DEFLATE_INFLATE, americanFootballBall.performInflate());
        assertEquals("American Football ball" + ROLL, americanFootballBall.roll());
    }

    @Test
    public void testBaseBall() {
        BaseballBall baseballBall = new BaseballBall();
        assertEquals(BOUNCE_IRREGULAR_BOUNCE, baseballBall.performBounce());
        assertEquals(DEFLATE_NOT_DEFLATE, baseballBall.performDeflate());
        assertEquals(DEFLATE_NOT_INFLATE, baseballBall.performInflate());
        assertEquals("Baseball ball" + ROLL, baseballBall.roll());
    }

    @Test
    public void testBeachBall() {
        BeachBall beachBall = new BeachBall();
        assertEquals(BOUNCE_NORMAL_BOUNCE, beachBall.performBounce());
        assertEquals(DEFLATE_DEFLATE, beachBall.performDeflate());
        assertEquals(DEFLATE_INFLATE, beachBall.performInflate());
        assertEquals("Beach Ball" + ROLL, beachBall.roll());
    }

    @Test
    public void testBowlingBall() {
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals(BOUNCE_IRREGULAR_BOUNCE, bowlingBall.performBounce());
        assertEquals(DEFLATE_NOT_DEFLATE, bowlingBall.performDeflate());
        assertEquals(DEFLATE_NOT_INFLATE, bowlingBall.performInflate());
        assertEquals("Bowling Ball" + ROLL, bowlingBall.roll());
    }

    @Test
    public void testCrystalBall() {
        CrystalBall crystalBall = new CrystalBall();
        assertEquals(BOUNCE_CRASH, crystalBall.performBounce());
        assertEquals(DEFLATE_NOT_DEFLATE, crystalBall.performDeflate());
        assertEquals(DEFLATE_NOT_INFLATE, crystalBall.performInflate());
        assertEquals("Crystal Ball" + ROLL, crystalBall.roll());
    }

    @Test
    public void testGolfBall() {
        GolfBall golfBall = new GolfBall();
        assertEquals(BOUNCE_NORMAL_BOUNCE   , golfBall.performBounce());
        assertEquals(DEFLATE_NOT_DEFLATE, golfBall.performDeflate());
        assertEquals(DEFLATE_NOT_INFLATE, golfBall.performInflate());
        assertEquals("Golf Ball" + ROLL, golfBall.roll());
    }

    @Test
    public void testSoccerBall() {
        SoccerBall soccerBall = new SoccerBall();
        assertEquals(BOUNCE_NORMAL_BOUNCE, soccerBall.performBounce());
        assertEquals(DEFLATE_DEFLATE, soccerBall.performDeflate());
        assertEquals(DEFLATE_INFLATE, soccerBall.performInflate());
        assertEquals("Soccer ball" + ROLL, soccerBall.roll());
    }

    @Test
    public void testTennisBall() {
        TennisBall tennisBall = new TennisBall();
        assertEquals(BOUNCE_NORMAL_BOUNCE, tennisBall.performBounce());
        assertEquals(DEFLATE_DEFLATE, tennisBall.performDeflate());
        assertEquals(DEFLATE_INFLATE, tennisBall.performInflate());
        assertEquals("Tennis Ball" + ROLL, tennisBall.roll());
    }
}
