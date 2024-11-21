package com.kurtulussahin.java.problems.vowelremover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChallengeTests {
  @Test
  public void test1() {
    assertEquals("f bm rsgns frm ffc NW, thrby dng  grt srvc t th cntry— wll gv hm fr lftm glf t ny n f my crss!", VowelRemover.removeVowels("If Obama resigns from office NOW, thereby doing a great service to the country—I will give him free lifetime golf at any one of my courses!"));
  }
	
	@Test
  public void test2() {
    assertEquals("Ths lctn s  ttl shm nd  trvsty. W r nt  dmcrcy!", VowelRemover.removeVowels("This election is a total sham and a travesty. We are not a democracy!"));
  }
	
	@Test
  public void test3() {
    assertEquals(" hv nvr sn  thn prsn drnkng Dt Ck.", VowelRemover.removeVowels("I have never seen a thin person drinking Diet Coke."));
  }
	
	@Test
  public void test4() {
    assertEquals("vrybdy wnts m t tlk bt Rbrt Pttnsn nd nt Brn Wllms— gss ppl jst dn’t cr bt Brn!", VowelRemover.removeVowels("Everybody wants me to talk about Robert Pattinson and not Brian Williams—I guess people just don’t care about Brian!"));
  }
	
	@Test
  public void test5() {
    assertEquals("Kty, wht th hll wr y thnkng whn y mrrd lsr Rssll Brnd. Thr s  gy wh hs gt nthng gng,  wst!", VowelRemover.removeVowels("Katy, what the hell were you thinking when you married loser Russell Brand. There is a guy who has got nothing going, a waste!"));
  }
	
	@Test
  public void test6() {
    assertEquals("Wndmlls r th grtst thrt n th S t bth bld nd gldn gls. Md clms fctnl ‘glbl wrmng’ s wrs.", VowelRemover.removeVowels("Windmills are the greatest threat in the US to both bald and golden eagles. Media claims fictional ‘global warming’ is worse."));
  }
	
	@Test
  public void test7() {
    assertEquals("Srry lsrs nd htrs, bt my .Q. s n f th hghst -nd y ll knw t! Pls dn’t fl s stpd r nscr,t’s nt yr flt", VowelRemover.removeVowels("Sorry losers and haters, but my I.Q. is one of the highest -and you all know it! Please don’t feel so stupid or insecure,it’s not your fault"));
  }
	
	@Test
  public void test8() {
    assertEquals("Hppy Thnksgvng t ll--vn th htrs nd lsrs!", VowelRemover.removeVowels("Happy Thanksgiving to all--even the haters and losers!"));
  }
	
	@Test
  public void test9() {
    assertEquals("Wtch Ksch sqrm --- f h s nt trthfl n hs ngtv ds  wll s hm jst fr fn!", VowelRemover.removeVowels("Watch Kasich squirm --- if he is not truthful in his negative ads I will sue him just for fun!"));
  }
	
	@Test
  public void test10() {
    assertEquals("bm s, wtht qstn, th WRST VR prsdnt.  prdct h wll nw d smthng rlly bd nd ttlly stpd t shw mnhd!", VowelRemover.removeVowels("Obama is, without question, the WORST EVER president. I predict he will now do something really bad and totally stupid to show manhood!"));
  }
}