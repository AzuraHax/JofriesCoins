import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import org.newdawn.slick.*;

public class BlockGame extends BasicGame {
	/* Floats, Images And Variables */Random r = new Random();
	private Music music;
	private Sound sound;
	private Sound sound1;
	Image BackGround1;
	Image Sprite;
	Image Sprite1;
	Image Sprite2;
	Image Sprite3;
	Image Sprite4;
	Image Sprite5;
	Image Slide1;
	Image Slide2;
	Image Slide3;
	Image Slide4;
	Image Slide5;
	Image Enemy1;
	Image Enemy2;
	Image Enemy3;
	Image Enemy4;
	Image Enemy5;
	Image Enemy6;
	Image Enemy7;
	Image Enemy8;
	Image Background2;
	float x = 650;
	float y = 650;
	float speed = 0f;
	float x2 = r.nextInt(600);
	float y2 = r.nextInt(600);
	float x3 = r.nextInt(600);
	float y3 = r.nextInt(600);
	float x4 = r.nextInt(600);
	float y4 = r.nextInt(600);
	float x5 = r.nextInt(600);
	float y5 = r.nextInt(600);
	float x6 = r.nextInt(600);
	float y6 = r.nextInt(600);
	float x7 = r.nextInt(600);
	float y7 = r.nextInt(600);
	float x8 = r.nextInt(600);
	float y8 = r.nextInt(600);
	float x9 = r.nextInt(600);
	float y9 = r.nextInt(600);
	float x15 = r.nextInt(600);
	float y15 = r.nextInt(600);
	float x10 = x;
	float y10 = y;
	float x11 = x;
	float y11 = y;
	float x12 = x;
	float y12 = y;
	int gr = 0;
	int s = 0;/* Floats, Images And Variables */
	int v = 0;
	int sd = 0;

	public BlockGame(String title) {
		super(title);
	}

	public static void main(String args[]) throws SlickException {/* Start Game */
		AppGameContainer a = new AppGameContainer(
				new BlockGame("Jofries Coins"));
		a.setDisplayMode(700, 700, false);
		a.setShowFPS(false);
		a.start();

		/* Start Game */
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {/* GraphicsRender */
		g.drawImage(BackGround1, 0, 0);
		g.drawImage(Sprite, x, y);
		g.drawImage(Enemy1, x2, y2);
		g.drawImage(Enemy2, x3, y3);
		g.drawString("Your Score Is " + s, 500, 10);

		if (s >= 100) {
			g.drawImage(Sprite2, x10, y10);
		}
		if (s >= 200) {
			g.drawImage(Sprite3, x11, y11);
		}
		if (s >= 300) {
			g.drawImage(Sprite4, x12, y12);
		}
		if (s >= 20) {
			g.drawImage(Enemy3, x4, y4);
		}
		if (s >= 40) {
			g.drawImage(Enemy4, x5, y5);
		}
		if (s >= 60) {
			g.drawImage(Enemy5, x6, y6);
		}
		if (s >= 80) {
			g.drawImage(Enemy6, x9, y9);
		}
		if (s >= 100) {
			g.drawImage(Enemy8, x15, y15);
		}
		if (gc.isPaused()) {
			g.drawImage(Background2, 0, 0);
			g.drawString("Your Score Was " + s + " And You Restarted " + gr
					+ " Times", 160, 350);
			/* GraphicsRender */
		}
		/* Game Gui */
		if (v == 0) {
			g.drawImage(Slide1, 0, 0);
		}
		if (v == 1) {
			g.drawImage(Slide2, 0, 0);
		}
		if (v == 2) {
			g.drawImage(Slide3, 0, 0);
		}
		if (v == 3) {
			g.drawImage(Slide4, 0, 0);
		}
		if (v == 4) {
			g.drawImage(Slide5, 0, 0);
		}
	}

	@Override
	public void init(GameContainer gc) throws SlickException {/* SpriteLoaders */
		 music = new Music("res/Jofries.wav");
			music.loop();
			music.setVolume(1f);
			sound = new Sound("res/Azura.wav");
			sound1 = new Sound("res/AzuraJofrie.wav");
		BackGround1 = new Image("BackGround.png");
		Sprite = new Image("Sprite.png");
		Sprite1 = new Image("Sprite.png");
		Sprite2 = new Image("Sprite.png");
		Sprite3 = new Image("Sprite.png");
		Sprite4 = new Image("Sprite.png");
		Sprite5 = new Image("Sprite.png");
		Slide1 = new Image("Slide1.png");
		Slide2 = new Image("Slide2.png");
		Slide3 = new Image("Slide3.png");
		Slide4 = new Image("Slide4.png");
		Slide5 = new Image("Slide5.png");
		Enemy1 = new Image("Enemy1.png");
		Enemy2 = new Image("Enemy2.png");
		Enemy3 = new Image("Enemy2.png");
		Enemy4 = new Image("Enemy2.png");
		Enemy5 = new Image("Enemy2.png");
		Enemy6 = new Image("Enemy2.png");
		Enemy7 = new Image("Enemy2.png");
		Enemy8 = new Image("Enemy2.png");
		Background2 = new Image("BoxGame.png");
		if (sd < 0){
			music.stop();
		}
		if (sd >= 1 ){
			music.loop();
			music.setVolume(1f);
		}
	}/* SpriteLoaders */

	@Override
	public void update(GameContainer gc, int d) throws SlickException {
		Input i = gc.getInput();
		/* KeyLoggers */
		if (v == 1) {
			speed = 0f;
		}
		if (v == 2) {
			speed = 0f;
		}
		if (v == 3) {
			speed = 0f;
		}
		if (v == 4) {
			speed = 0f;
		}
		
		if (s <= 24) {
			speed = 1f;
		}
		if (s >= 25) {
			speed = 1.25f;
		}
		if (s >= 50) {
			speed = 1.5f;
		}
		if (s >= 75) {
			speed = 1.75f;
		}
		if (s >= 100) {
			speed = 2f;
		}
		if (s >= 125) {
			speed = 2.25f;
		}
		if (s >= 150) {
			speed = 2.5f;
		}
		if (s >= 175) {
			speed = 2.75f;
		}
		if (s >= 200) {
			speed = 3f;
		}
		if (s >= 225) {
			speed = 3.25f;
		}
		if (s >= 250) {
			speed = 3.5f;
		}
		if (s >= 275) {
			speed = 3.75f;
		}
		if (s >= 300) {
			speed = 4f;
		}
		if (s >= 325) {
			speed = 4.25f;
		}
		if (s >= 350) {
			speed = 4.5f;
		}
		if (s >= 375) {
			speed = 4.75f;
		}
		if (s >= 400) {
			speed = 5f;
		}
		if (s >= 425) {
			speed = 5.25f;
		}
		if (s >= 450) {
			speed = 5.5f;
		}
		if (s >= 475) {
			speed = 5.75f;
		}
		if (s >= 500) {
			speed = 6f;
		}
		if (s >= 525) {
			speed = 6.25f;
		}
		if (s >= 550) {
			speed = 6.5f;
		}
		if (s >= 575) {
			speed = 6.75f;
		}
		if (s >= 600) {
			speed = 7f;
		}
		if (s >= 625) {
			speed = 7.25f;
		}
		if (s >= 650) {
			speed = 7.5f;
		}
		if (s >= 675) {
			speed = 7.75f;
		}
		if (s >= 700) {
			speed = 8f;
		}
		if (s >= 725){
			speed = 8.25f;
		}
		if (s >= 750){
			speed = 8.5f;
		}
		if (s >= 775){
			speed = 8.75f;
		}
		if (s >= 800){
			speed = 9f;
		}
		if (s < 0) {
			gc.pause();
		}
		if (i.isKeyDown(Input.KEY_W)) {
			y -= speed * d;
		}
		if (s >= 100) {
			if (i.isKeyDown(Input.KEY_W)) {
				y10 += speed * d;
			}
		}
		if (s >= 200) {
			if (i.isKeyDown(Input.KEY_W)) {
				x11 -= speed * d;
			}
		}
		if (s >= 300) {
			if (i.isKeyDown(Input.KEY_W)) {
				x12 += speed * d;
			}
		}
		if (i.isKeyDown(Input.KEY_S)) {
			y += speed * d;
		}
		if (s >= 100) {
			if (i.isKeyDown(Input.KEY_S)) {
				y10 -= speed * d;
			}
		}
		if (s >= 200) {
			if (i.isKeyDown(Input.KEY_S)) {
				x11 += speed * d;
			}
		}
		if (s >= 300) {
			if (i.isKeyDown(Input.KEY_S)) {
				x12 -= speed * d;
			}
		}
		if (i.isKeyDown(Input.KEY_A)) {
			x -= speed * d;
		}
		if (s >= 100) {
			if (i.isKeyDown(Input.KEY_A)) {
				x10 += speed * d;
			}
		}
		if (s >= 200) {
			if (i.isKeyDown(Input.KEY_A)) {
				y11 -= speed * d;
			}
		}
		if (s >= 300) {
			if (i.isKeyDown(Input.KEY_A)) {
				y12 += speed * d;
			}
		}
		if (i.isKeyDown(Input.KEY_D)) {
			x += speed * d;
		}
		if (s >= 100) {
			if (i.isKeyDown(Input.KEY_D)) {
				x10 -= speed * d;
			}
		}
		if (s >= 200) {
			if (i.isKeyDown(Input.KEY_D)) {
				y11 += speed * d;
			}
		}
		if (s >= 300) {
			if (i.isKeyDown(Input.KEY_D)) {
				y12 += speed * d;
			}
		}
		if (i.isKeyPressed(Input.KEY_P)) {
			gc.setShowFPS(true);
			gc.getBuildVersion();
			gc.getSoundVolume();
		}
		if (i.isKeyPressed(Input.KEY_O)) {
			gc.setVSync(true);
		}
		if (i.isKeyPressed(Input.KEY_ESCAPE)) {
			gc.exit();
		}
		if (i.isKeyPressed(Input.KEY_E)) {
			gc.pause();
		}
		if (i.isKeyPressed(Input.KEY_ENTER)) {
			sd += 1;
			v += 1;
		}
		if (i.isKeyPressed(Input.KEY_0)) {
			v = 0;
		}
		if (i.isKeyPressed(Input.KEY_1)) {
			v = 1;
		}
		if (i.isKeyPressed(Input.KEY_2)) {
			v = 2;
		}
		if (i.isKeyPressed(Input.KEY_3)) {
			v = 3;
		}
		if (i.isKeyPressed(Input.KEY_4)) {
			v = 4;
		}
		if (i.isKeyPressed(Input.KEY_R)) {
			gc.resume();
			gr += 1;
			sd = -1;
			s = 0;
			v = 0;
			Random r = new Random();
			x = 650;
			y = 650;
			x2 = r.nextInt(600);
			y2 = r.nextInt(600);
			x3 = r.nextInt(600);
			y3 = r.nextInt(600);
			x4 = r.nextInt(600);
			y4 = r.nextInt(600);
			x5 = r.nextInt(600);
			y5 = r.nextInt(600);
			x6 = r.nextInt(600);
			y6 = r.nextInt(600);
			x7 = r.nextInt(600);
			y7 = r.nextInt(600);
			x8 = r.nextInt(600);
			y8 = r.nextInt(600);
			x10 = x;
			y10 = y;
			x11 = x;
			y11 = y;
			x12 = x;
			y12 = y;
			x9 = r.nextInt(600);
			y9 = r.nextInt(600);
		}/* KeyLoggers */
		/* Check Distance */float d1 = (x - x2) * (x - x2) + (y - y2)
				* (y - y2);
		float CheckDistance1 = (20 + 20) * (20 + 20);
		if (d1 < CheckDistance1) {
			Random r = new Random();
			sound.play();
			x2 = r.nextInt(600);
			y2 = r.nextInt(600);
			s += 1;
		}
		float d35 = (x10 - x2) * (x10 - x2) + (y10 - y2) * (y10 - y2);
		float CheckDistance35 = (20 + 20) * (20 + 20);
		if (d35 < CheckDistance35) {
			Random r = new Random();
			sound.play();
			x2 = r.nextInt(600);
			y2 = r.nextInt(600);
			s += 1;
		}
		float d41 = (x11 - x2) * (x11 - x2) + (y11 - y2) * (y11 - y2);
		float CheckDistance41 = (20 + 20) * (20 + 20);
		if (d41 < CheckDistance41) {
			Random r = new Random();
			sound.play();
			x2 = r.nextInt(600);
			y2 = r.nextInt(600);
			s += 1;
		}
		float d47 = (x12 - x2) * (x12 - x2) + (y12 - y2) * (y12 - y2);
		float CheckDistance47 = (20 + 20) * (20 + 20);
		if (d47 < CheckDistance47) {
			Random r = new Random();
			sound.play();
			x2 = r.nextInt(600);
			y2 = r.nextInt(600);
			s += 1;
		}
		float d2 = (x - x3) * (x - x3) + (y - y3) * (y - y3);
		float CheckDistance2 = (35 + 35) * (35 + 35);
		if (d2 < CheckDistance2) {
			x = 650;
			y = 650;
			sound1.play();
			gc.pause();
		}
		float d36 = (x10 - x3) * (x10 - x3) + (y10 - y3) * (y10 - y3);
		float CheckDistance36 = (35 + 35) * (35 + 35);
		if (d36 < CheckDistance36) {
			x10 = 650;
			y10 = 650;
			sound.play();
			gc.pause();
		}
		float d42 = (x11 - x3) * (x11 - x3) + (y11 - y3) * (y11 - y3);
		float CheckDistance42 = (35 + 35) * (35 + 35);
		if (d42 < CheckDistance42) {
			x11 = 650;
			y11 = 650;
			sound1.play();
			gc.pause();
		}
		float d48 = (x12 - x3) * (x12 - x3) + (y12 - y3) * (y12 - y3);
		float CheckDistance48 = (35 + 35) * (35 + 35);
		if (d48 < CheckDistance48) {
			x12 = 650;
			y12 = 650;
			sound1.play();
			gc.pause();
		}
		float d3 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
		float CheckDistance3 = (70 + 70) * (70 + 70);
		if (d3 < CheckDistance3) {
			Random r = new Random();
			x2 = r.nextInt(600);
			y2 = r.nextInt(600);
		}
		if (s >= 20) {
			float d4 = (x - x4) * (x - x4) + (y - y4) * (y - y4);
			float CheckDistance4 = (35 + 35) * (35 + 35);
			if (d4 < CheckDistance4) {
				x = 650;
				y = 650;
				sound1.play();
				gc.pause();
			}
			if (s >= 20) {
				float d37 = (x10 - x4) * (x10 - x4) + (y10 - y4) * (y10 - y4);
				float CheckDistance37 = (35 + 35) * (35 + 35);
				if (d37 < CheckDistance37) {
					x10 = 650;
					y10 = 650;
					sound1.play();
					gc.pause();
				}
				if (s >= 20) {
					float d43 = (x11 - x4) * (x11 - x4) + (y11 - y4)
							* (y11 - y4);
					float CheckDistance43 = (35 + 35) * (35 + 35);
					if (d43 < CheckDistance43) {
						x11 = 650;
						y11 = 650;
						sound1.play();
						gc.pause();
					}
					if (s >= 20) {
						float d49 = (x12 - x4) * (x12 - x4) + (y12 - y4)
								* (y12 - y4);
						float CheckDistance49 = (35 + 35) * (35 + 35);
						if (d49 < CheckDistance49) {
							x12 = 650;
							y12 = 650;
							sound1.play();
							gc.pause();
						}
						if (s >= 20) {
							float d5 = (x2 - x4) * (x2 - x4) + (y2 - y4)
									* (y2 - y4);
							float CheckDistance5 = (70 + 70) * (70 + 70);
							if (d5 < CheckDistance5) {
								Random r = new Random();
								x2 = r.nextInt(600);
								y2 = r.nextInt(600);
							}
							if (s >= 40) {
								float d6 = (x - x5) * (x - x5) + (y - y5)
										* (y - y5);
								float CheckDistance6 = (35 + 35) * (35 + 35);
								if (d6 < CheckDistance6) {
									x = 650;
									y = 650;
									sound1.play();
									gc.pause();
								}
								if (s >= 40) {
									float d38 = (x10 - x5) * (x10 - x5)
											+ (y10 - y5) * (y10 - y5);
									float CheckDistance38 = (35 + 35)
											* (35 + 35);
									if (d38 < CheckDistance38) {
										x10 = 650;
										y10 = 650;
										sound1.play();
										gc.pause();
									}
									if (s >= 40) {
										float d44 = (x11 - x5) * (x11 - x5)
												+ (y11 - y5) * (y11 - y5);
										float CheckDistance44 = (35 + 35)
												* (35 + 35);
										if (d44 < CheckDistance44) {
											x11 = 650;
											y11 = 650;
											sound1.play();
											gc.pause();
										}
										if (s >= 40) {
											float d50 = (x12 - x5) * (x12 - x5)
													+ (y12 - y5) * (y12 - y5);
											float CheckDistance50 = (35 + 35)
													* (35 + 35);
											if (d50 < CheckDistance50) {
												x12 = 650;
												y12 = 650;
												sound1.play();
												gc.pause();
											}
											if (s >= 40) {
												float d7 = (x2 - x5)
														* (x2 - x5) + (y2 - y5)
														* (y2 - y5);
												float CheckDistance7 = (70 + 70)
														* (70 + 70);
												if (d7 < CheckDistance7) {
													Random r = new Random();
														x2 = r.nextInt(600);
														y2 = r.nextInt(600);
													}
													if (s  >=60) {
													float d8 = (x - x6)
															* (x - x6)
															+ (y - y6)
															* (y - y6);
													float CheckDistance8 = (35 + 35)
															* (35 + 35);
													if (d8 < CheckDistance8) {
														x = 650;
														y = 650;
														sound1.play();
														gc.pause();
													}
													if (s >= 60) {
														float d39 = (x10 - x6)
																* (x10 - x6)
																+ (y10 - y6)
																* (y10 - y6);
														float CheckDistance39 = (35 + 35)
																* (35 + 35);
														if (d39 < CheckDistance39) {
															x10 = 650;
															y10 = 650;
															sound1.play();
															gc.pause();
														}
														if (s >= 60) {
															float d45 = (x11 - x6)
																	* (x11 - x6)
																	+ (y11 - y6)
																	* (y11 - y6);
															float CheckDistance45 = (35 + 35)
																	* (35 + 35);
															if (d45 < CheckDistance45) {
																x11 = 650;
																y11 = 650;
																sound1.play();
																gc.pause();
															}
															if (s >= 60) {
																float d51 = (x12 - x6)
																		* (x12 - x6)
																		+ (y12 - y6)
																		* (y12 - y6);
																float CheckDistance51 = (35 + 35)
																		* (35 + 35);
																if (d51 < CheckDistance51) {
																	x12 = 650;
																	y12 = 650;
																	sound1.play();
																	gc.pause();
																}
															}
															if (s >= 80) {
																float d34 = (x - x9)
																		* (x - x9)
																		+ (x - y9)
																		* (y - y9);
																float CheckDistance34 = (35 + 35)
																		* (35 + 35);
																if (d34 < CheckDistance34) {
																	x = 650;
																	y = 650;
																	sound1.play();
																	gc.pause();
																}
																if (s >= 80) {
																	float d40 = (x10 - x9)
																			* (x10 - x9)
																			+ (y10 - y9)
																			* (y10 - y9);
																	float CheckDistance40 = (35 + 35)
																			* (35 + 35);
																	if (d40 < CheckDistance40) {
																		x10 = 650;
																		y10 = 650;
																		sound1.play();
																		gc.pause();
																	}
																	if (s >= 80) {
																		float d46 = (x11 - x9)
																				* (x11 - x9)
																				+ (y11 - y9)
																				* (y11 - y9);
																		float CheckDistance46 = (35 + 35)
																				* (35 + 35);
																		if (d46 < CheckDistance46) {
																			x11 = 650;
																			y11 = 650;
																			sound1.play();
																			gc.pause();
																		}
																		if (s >= 80) {
																			float d52 = (x12 - x9)
																					* (x12 - x9)
																					+ (y12 - y9)
																					* (y12 - y9);
																			float CheckDistance52 = (35 + 35)
																					* (35 + 35);
																			if (d52 < CheckDistance52) {
																				x12 = 650;
																				y12 = 650;
																				sound1.play();
																				gc.pause();
																			}
																			if (s >= 80) {
																				float d53 = (x - x15)
																						* (x - x15)
																						+ (y - y15)
																						* (y - y15);
																				float CheckDistance53 = (35 + 35)
																						* (35 + 35);
																				if (d53 < CheckDistance53) {
																					x15 = 650;
																					y15 = 650;
																					sound1.play();
																					gc.pause();
																				}
																				if (s >= 80) {
																					float d54 = (x2 - x15)
																							* (x2 - x15)
																							+ (y2 - y15)
																							* (y2 - y15);
																					float CheckDistance54 = (35 + 35)
																							* (35 + 35);
																					if (d54 < CheckDistance54) {
																						x15 = 650;
																						y15 = 650;
																						sound1.play();
																						gc.pause();
																					}
																				}
																			}
																			if (s >= 60) {
																				float d9 = (x2 - x6)
																						* (x2 - x6)
																						+ (y2 - y6)
																						* (y2 - y6);
																				float CheckDistance9 = (70 + 70)
																						* (70 + 70);
																				if (d9 < CheckDistance9) {
																					Random r1 = new Random();
																					x2 = r1.nextInt(600);
																					y2 = r1.nextInt(600);
																				}
																				if (s >= 80) {
																					float d33 = (x2 - x9)
																							* (x2 - x9)
																							+ (y2 - y9)
																							* (y2 - y6);
																					float CheckDistance33 = (70 + 70)
																							* (70 + 70);
																					if (d33 < CheckDistance33) {
																						Random r1 = new Random();
																						x2 = r1.nextInt(600);
																						y2 = r1.nextInt(600);
																					}
																					/*
																					 * Check
																					 * Distance
																					 *//*
																						 * Enemy3
																						 * -
																						 * Enemy6
																						 * Distance
																						 */float d100 = (x3 - x4)
																							* (x3 - x4)
																							+ (y3 - y4)
																							* (y3 - y4);
																					float CheckDistance100 = (100 + 100)
																							* (100 + 100);
																					if (d100 < CheckDistance100) {
																						x3 = r.nextInt(600);
																						y3 = r.nextInt(600);
																						x4 = r.nextInt(600);
																						y4 = r.nextInt(600);
																						float d11 = (x3 - x5)
																								* (x3 - x5)
																								+ (y3 - y5)
																								* (y3 - y5);
																						float CheckDistance11 = (100 + 100)
																								* (100 + 100);
																						if (d11 < CheckDistance11) {
																							x3 = r.nextInt(600);
																							y3 = r.nextInt(600);
																							x5 = r.nextInt(600);
																							y5 = r.nextInt(600);
																							float d12 = (x3 - x6)
																									* (x3 - x6)
																									+ (y3 - y6)
																									* (y3 - y6);
																							float CheckDistance12 = (100 + 100)
																									* (100 + 100);
																							if (d12 < CheckDistance12) {
																								x3 = r.nextInt(600);
																								y3 = r.nextInt(600);
																								x6 = r.nextInt(600);
																								y6 = r.nextInt(600);
																								float d13 = (x3 - x7)
																										* (x3 - x7)
																										+ (y3 - y7)
																										* (y3 - y7);
																								float CheckDistance13 = (100 + 100)
																										* (100 + 100);
																								if (d13 < CheckDistance13) {
																									x3 = r.nextInt(600);
																									y3 = r.nextInt(600);
																									x7 = r.nextInt(600);
																									y7 = r.nextInt(600);
																									float d14 = (x3 - x8)
																											* (x3 - x8)
																											+ (y3 - y8)
																											* (y3 - y8);
																									float CheckDistance14 = (100 + 100)
																											* (100 + 100);
																									if (d14 < CheckDistance14) {
																										x3 = r.nextInt(600);
																										y3 = r.nextInt(600);
																										x8 = r.nextInt(600);
																										y8 = r.nextInt(600);
																										float d15 = (x4 - x5)
																												* (x4 - x5)
																												+ (y4 - y5)
																												* (y4 - y5);
																										float CheckDistance15 = (100 + 100)
																												* (100 + 100);
																										if (d15 < CheckDistance15) {
																											x4 = r.nextInt(600);
																											y4 = r.nextInt(600);
																											x5 = r.nextInt(600);
																											y5 = r.nextInt(600);
																											float d16 = (x4 - x6)
																													* (x4 - x6)
																													+ (y4 - y6)
																													* (y4 - y6);
																											float CheckDistance16 = (100 + 100)
																													* (100 + 100);
																											if (d16 < CheckDistance16) {
																												x4 = r.nextInt(600);
																												y4 = r.nextInt(600);
																												x6 = r.nextInt(600);
																												y6 = r.nextInt(600);
																												float d17 = (x4 - x7)
																														* (x4 - x7)
																														+ (y4 - y7)
																														* (y4 - y7);
																												float CheckDistance17 = (100 + 100)
																														* (100 + 100);
																												if (d17 < CheckDistance17) {
																													x4 = r.nextInt(600);
																													y4 = r.nextInt(600);
																													x7 = r.nextInt(600);
																													y7 = r.nextInt(600);
																													float d18 = (x4 - x7)
																															* (x4 - x7)
																															+ (y4 - y7)
																															* (y4 - y7);
																													float CheckDistance18 = (100 + 100)
																															* (100 + 100);
																													if (d18 < CheckDistance18) {
																														x4 = r.nextInt(600);
																														y4 = r.nextInt(600);
																														x7 = r.nextInt(600);
																														y7 = r.nextInt(600);
																														float d19 = (x4 - x8)
																																* (x4 - x8)
																																+ (y4 - y8)
																																* (y4 - y8);
																														float CheckDistance19 = (100 + 100)
																																* (100 + 100);
																														if (d19 < CheckDistance19) {
																															x4 = r.nextInt(600);
																															y4 = r.nextInt(600);
																															x8 = r.nextInt(600);
																															y8 = r.nextInt(600);
																															float d20 = (x5 - x6)
																																	* (x5 - x6)
																																	+ (y5 - y6)
																																	* (y5 - y6);
																															float CheckDistance20 = (100 + 100)
																																	* (100 + 100);
																															if (d20 < CheckDistance20) {
																																x5 = r.nextInt(600);
																																y5 = r.nextInt(600);
																																x6 = r.nextInt(600);
																																y6 = r.nextInt(600);
																																float d21 = (x5 - x7)
																																		* (x5 - x7)
																																		+ (y5 - y7)
																																		* (y5 - y7);
																																float CheckDistance21 = (100 + 100)
																																		* (100 + 100);
																																if (d21 < CheckDistance21) {
																																	x5 = r.nextInt(600);
																																	y5 = r.nextInt(600);
																																	x7 = r.nextInt(600);
																																	r.nextInt(600);
																																	float d22 = (x5 - x8)
																																			* (x5 - x8)
																																			+ (y5 - y8)
																																			* (y5 - y8);
																																	float CheckDistance22 = (100 + 100)
																																			* (100 + 100);
																																	if (d22 < CheckDistance22) {
																																		x5 = r.nextInt(600);
																																		y5 = r.nextInt(600);
																																		x8 = r.nextInt(600);
																																		y8 = r.nextInt(600);
																																		float d23 = (x6 - x7)
																																				* (x6 - x7)
																																				+ (y6 - y7)
																																				* (y6 - y7);
																																		float CheckDistance23 = (100 + 100)
																																				* (100 + 100);
																																		if (d23 < CheckDistance23) {
																																			x6 = r.nextInt(600);
																																			y6 = r.nextInt(600);
																																			x7 = r.nextInt(600);
																																			y7 = r.nextInt(600);
																																			float d24 = (x6 - x8)
																																					* (x6 - x8)
																																					+ (y6 - y8)
																																					* (y6 - y8);
																																			float CheckDistance24 = (100 + 100)
																																					* (100 + 100);
																																			if (d24 < CheckDistance24) {
																																				x6 = r.nextInt(600);
																																				y6 = r.nextInt(600);
																																				x8 = r.nextInt(600);
																																				y8 = r.nextInt(600);
																																				float d25 = (x7 - x8)
																																						* (x7 - x8)
																																						+ (y7 - 78)
																																						* (y7 - y8);
																																				float CheckDistance25 = (100 + 100)
																																						* (100 + 100);
																																				if (d25 < CheckDistance25) {
																																					x7 = r.nextInt(600);
																																					y7 = r.nextInt(600);
																																					x8 = r.nextInt(600);
																																					y8 = r.nextInt(600);
																																					float d26 = (x3 - x9)
																																							* (x3 - x9)
																																							+ (y3 - 79)
																																							* (y3 - y9);
																																					float CheckDistance26 = (100 + 100)
																																							* (100 + 100);
																																					if (d26 < CheckDistance26) {
																																						x3 = r.nextInt(600);
																																						y3 = r.nextInt(600);
																																						x9 = r.nextInt(600);
																																						y9 = r.nextInt(600);
																																						float d27 = (x4 - x9)
																																								* (x4 - x9)
																																								+ (y4 - 79)
																																								* (y4 - y9);
																																						float CheckDistance27 = (100 + 100)
																																								* (100 + 100);
																																						if (d27 < CheckDistance27) {
																																							x4 = r.nextInt(600);
																																							y4 = r.nextInt(600);
																																							x9 = r.nextInt(600);
																																							y9 = r.nextInt(600);
																																							float d28 = (x5 - x9)
																																									* (x5 - x9)
																																									+ (y5 - 79)
																																									* (y5 - y9);
																																							float CheckDistance28 = (100 + 100)
																																									* (100 + 100);
																																							if (d28 < CheckDistance28) {
																																								x5 = r.nextInt(600);
																																								y5 = r.nextInt(600);
																																								x9 = r.nextInt(600);
																																								y9 = r.nextInt(600);
																																								float d29 = (x6 - x9)
																																										* (x6 - x9)
																																										+ (y6 - 79)
																																										* (y6 - y9);
																																								float CheckDistance29 = (100 + 100)
																																										* (100 + 100);
																																								if (d29 < CheckDistance29) {
																																									x6 = r.nextInt(600);
																																									y = r.nextInt(600);
																																									x9 = r.nextInt(600);
																																									y9 = r.nextInt(600);
																																									float d30 = (x6 - x9)
																																											* (x6 - x9)
																																											+ (y6 - 79)
																																											* (y6 - y9);
																																									float CheckDistance30 = (100 + 100)
																																											* (100 + 100);
																																									if (d30 < CheckDistance30) {
																																										x6 = r.nextInt(600);
																																										y6 = r.nextInt(600);
																																										x9 = r.nextInt(600);
																																										y9 = r.nextInt(600);
																																										float d31 = (x7 - x9)
																																												* (x7 - x9)
																																												+ (y7 - 79)
																																												* (y7 - y9);
																																										float CheckDistance31 = (100 + 100)
																																												* (100 + 100);
																																										if (d31 < CheckDistance31) {
																																											x7 = r.nextInt(600);
																																											y7 = r.nextInt(600);
																																											x9 = r.nextInt(600);
																																											y9 = r.nextInt(600);
																																											float d32 = (x8 - x9)
																																													* (x8 - x9)
																																													+ (y8 - y9)
																																													* (y8 - y9);
																																											float CheckDistance32 = (100 + 100)
																																													* (100 + 100);
																																											if (d32 < CheckDistance32) {
																																												x8 = r.nextInt(600);
																																												y8 = r.nextInt(600);
																																												x9 = r.nextInt(600);
																																												y9 = r.nextInt(600);
																																												float d54 = (x3 - x15)
																																														* (x3 - x15)
																																														+ (y3 - y15)
																																														* (y3 - y15);
																																												float CheckDistance54 = (100 + 100)
																																														* (100 + 100);
																																												if (d54 < CheckDistance54) {
																																													x3 = r.nextInt(600);
																																													y3 = r.nextInt(600);
																																													x15 = r.nextInt(600);
																																													y15 = r.nextInt(600);
																																													float d55 = (x3 - x15)
																																															* (x3 - x15)
																																															+ (y3 - y15)
																																															* (y3 - y15);
																																													float CheckDistance55 = (100 + 100)
																																															* (100 + 100);
																																													if (d55 < CheckDistance55) {
																																														x3 = r.nextInt(600);
																																														y3 = r.nextInt(600);
																																														x15 = r.nextInt(600);
																																														y15 = r.nextInt(600);
																																														float d56 = (x4 - x15)
																																																* (x4 - x15)
																																																+ (y4 - y15)
																																																* (y4 - y15);
																																														float CheckDistance56 = (100 + 100)
																																																* (100 + 100);
																																														if (d56 < CheckDistance56) {
																																															x4 = r.nextInt(600);
																																															y4 = r.nextInt(600);
																																															x15 = r.nextInt(600);
																																															y15 = r.nextInt(600);
																																															float d57 = (x5 - x15)
																																																	* (x5 - x15)
																																																	+ (y5 - y15)
																																																	* (y5 - y15);
																																															float CheckDistance57 = (100 + 100)
																																																	* (100 + 100);
																																															if (d57 < CheckDistance57) {
																																																x5 = r.nextInt(600);
																																																y5 = r.nextInt(600);
																																																x15 = r.nextInt(600);
																																																y15 = r.nextInt(600);
																																																float d58 = (x6 - x15)
																																																		* (x6 - x15)
																																																		+ (y6 - y15)
																																																		* (y6 - y15);
																																																float CheckDistance58 = (100 + 100)
																																																		* (100 + 100);
																																																if (d58 < CheckDistance58) {
																																																	x6 = r.nextInt(600);
																																																	y6 = r.nextInt(600);
																																																	x15 = r.nextInt(600);
																																																	y15 = r.nextInt(600);
																																																	float d59 = (x7 - x15)
																																																			* (x7 - x15)
																																																			+ (y7 - y15)
																																																			* (y7 - y15);
																																																	float CheckDistance59 = (100 + 100)
																																																			* (100 + 100);
																																																	if (d59 < CheckDistance59) {
																																																		x7 = r.nextInt(600);
																																																		y7 = r.nextInt(600);
																																																		x15 = r.nextInt(600);
																																																		y15 = r.nextInt(600);
																																																		float d60 = (x8 - x15)
																																																				* (x8 - x15)
																																																				+ (y8 - y15)
																																																				* (y8 - y15);
																																																		float CheckDistance60 = (100 + 100)
																																																				* (100 + 100);
																																																		if (d60 < CheckDistance60) {
																																																			x8 = r.nextInt(600);
																																																			y8 = r.nextInt(600);
																																																			x15 = r.nextInt(600);
																																																			y15 = r.nextInt(600);
																																																			float d61 = (x9 - x15)
																																																					* (x9 - x15)
																																																					+ (y9 - y15)
																																																					* (y9 - y15);
																																																			float CheckDistance61 = (100 + 100)
																																																					* (100 + 100);
																																																			if (d61 < CheckDistance61)
																																																				;
																																																			x9 = r.nextInt(600);
																																																			y9 = r.nextInt(600);
																																																			x15 = r.nextInt(600);
																																																			y15 = r.nextInt(600);

																																																			/*
																																																			 * Enemy3
																																																			 * -
																																																			 * Enemy6
																																																			 * Distance
																																																			 */
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
