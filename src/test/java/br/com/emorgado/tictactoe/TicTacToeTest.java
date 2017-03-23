package br.com.emorgado.tictactoe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TicTacToeTest {

	@Rule
    public ExpectedException exception = ExpectedException.none();
	private TicTacToe ticTacToe;
	private String nomeJogadorX;
	private String nomeJogadorO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
		//System.out.println("setup");
		nomeJogadorX = "Emerson";
		nomeJogadorO = "Patricia";
		ticTacToe = new TicTacToe( nomeJogadorX, nomeJogadorO );
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("tear down");
	}

	@Test
	public void deveSerInformadoONomeDosJogadores() {
		//fail("Not yet implemented");
		assertEquals( true, ticTacToe.temJogadores() );
	}
	
	@Test
	public void jogadorXehEmerson(){
		assertEquals( nomeJogadorX, ticTacToe.getJogadorX() );
	}
	
	@Test
	public void jogadorXehPatrocia(){
		assertEquals( nomeJogadorO, ticTacToe.getJogadorO() );
	}
	
	@Test
	public void jogadorXAposCorridigoEhPatriciaInes(){
		
		String nome = "Patricia Ines";
		ticTacToe.setJogadorO( nome );
		assertEquals( nome, ticTacToe.getJogadorO() );
	}
	
	@Test
	public void jogadorInformouUmaPosicaoInexistente(){
		
		exception.expect(RuntimeException.class);
		ticTacToe.jogadorXJoga( 5 );		
		
	}
	
	@Test
	public void jogadorInformouUmaPosicaoExistente(){
		
		ticTacToe.jogadorXJoga( 3 );		
		
	}
}
