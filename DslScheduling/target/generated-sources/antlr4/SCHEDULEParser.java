// Generated from SCHEDULE.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCHEDULEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, ROOM=20, BOARD=21, SCREEN=22, PROJECTOR=23, 
		SPEAKER=24, MICROPHONE=25, POINTER=26, LAPTOP=27, LECTURE=28, NAME=29, 
		COURSEID=30, HOUR=31, CLASS=32, PREFERENCE=33, CONSTRAINT=34, NUM=35, 
		WS=36, COMMA=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "'capacity'", "'duration'", "'require'", "'x'", "':'", 
		"';'", "'['", "'Class'", "']'", "'student'", "'hour'", "'day'", "'('", 
		"')'", "'course'", "'available'", "'facility'", "'-'", "ROOM", "BOARD", 
		"SCREEN", "PROJECTOR", "SPEAKER", "MICROPHONE", "POINTER", "LAPTOP", "LECTURE", 
		"NAME", "COURSEID", "HOUR", "CLASS", "PREFERENCE", "CONSTRAINT", "NUM", 
		"WS", "COMMA"
	};
	public static final int
		RULE_scheduling = 0, RULE_room_list = 1, RULE_a_room = 2, RULE_roomid = 3, 
		RULE_capacity = 4, RULE_facilities = 5, RULE_lecture_list = 6, RULE_a_lecture = 7, 
		RULE_time = 8, RULE_day = 9, RULE_start_h = 10, RULE_end_h = 11, RULE_class_list = 12, 
		RULE_a_class = 13, RULE_student = 14, RULE_duration = 15, RULE_preference_list = 16, 
		RULE_a_preference = 17, RULE_constraint_list = 18, RULE_a_constraint = 19;
	public static final String[] ruleNames = {
		"scheduling", "room_list", "a_room", "roomid", "capacity", "facilities", 
		"lecture_list", "a_lecture", "time", "day", "start_h", "end_h", "class_list", 
		"a_class", "student", "duration", "preference_list", "a_preference", "constraint_list", 
		"a_constraint"
	};

	@Override
	public String getGrammarFileName() { return "SCHEDULE.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCHEDULEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SchedulingContext extends ParserRuleContext {
		public Lecture_listContext lecture_list() {
			return getRuleContext(Lecture_listContext.class,0);
		}
		public Preference_listContext preference_list() {
			return getRuleContext(Preference_listContext.class,0);
		}
		public Constraint_listContext constraint_list() {
			return getRuleContext(Constraint_listContext.class,0);
		}
		public Room_listContext room_list() {
			return getRuleContext(Room_listContext.class,0);
		}
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public SchedulingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheduling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterScheduling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitScheduling(this);
		}
	}

	public final SchedulingContext scheduling() throws RecognitionException {
		SchedulingContext _localctx = new SchedulingContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_scheduling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(T__11);
			setState(41); room_list();
			setState(42); lecture_list();
			setState(43); class_list();
			setState(45);
			_la = _input.LA(1);
			if (_la==PREFERENCE) {
				{
				setState(44); preference_list();
				}
			}

			setState(48);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(47); constraint_list();
				}
			}

			setState(50); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Room_listContext extends ParserRuleContext {
		public TerminalNode ROOM() { return getToken(SCHEDULEParser.ROOM, 0); }
		public A_roomContext a_room(int i) {
			return getRuleContext(A_roomContext.class,i);
		}
		public List<A_roomContext> a_room() {
			return getRuleContexts(A_roomContext.class);
		}
		public Room_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterRoom_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitRoom_list(this);
		}
	}

	public final Room_listContext room_list() throws RecognitionException {
		Room_listContext _localctx = new Room_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_room_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(ROOM);
			setState(53); match(T__13);
			setState(54); match(T__11);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55); a_room();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(60); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_roomContext extends ParserRuleContext {
		public RoomidContext roomid() {
			return getRuleContext(RoomidContext.class,0);
		}
		public CapacityContext capacity() {
			return getRuleContext(CapacityContext.class,0);
		}
		public List<FacilitiesContext> facilities() {
			return getRuleContexts(FacilitiesContext.class);
		}
		public FacilitiesContext facilities(int i) {
			return getRuleContext(FacilitiesContext.class,i);
		}
		public A_roomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterA_room(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitA_room(this);
		}
	}

	public final A_roomContext a_room() throws RecognitionException {
		A_roomContext _localctx = new A_roomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_a_room);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); roomid();
			setState(63); match(T__18);
			setState(64); match(T__17);
			setState(65); match(T__13);
			setState(66); capacity();
			setState(67); match(T__12);
			setState(68); match(T__1);
			setState(69); match(T__13);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOARD) | (1L << SCREEN) | (1L << PROJECTOR) | (1L << SPEAKER) | (1L << MICROPHONE) | (1L << POINTER) | (1L << LAPTOP))) != 0)) {
				{
				{
				setState(70); facilities();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoomidContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SCHEDULEParser.NUM, 0); }
		public RoomidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterRoomid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitRoomid(this);
		}
	}

	public final RoomidContext roomid() throws RecognitionException {
		RoomidContext _localctx = new RoomidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_roomid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapacityContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SCHEDULEParser.NUM, 0); }
		public CapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterCapacity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitCapacity(this);
		}
	}

	public final CapacityContext capacity() throws RecognitionException {
		CapacityContext _localctx = new CapacityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_capacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacilitiesContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(SCHEDULEParser.POINTER, 0); }
		public TerminalNode PROJECTOR() { return getToken(SCHEDULEParser.PROJECTOR, 0); }
		public TerminalNode SPEAKER() { return getToken(SCHEDULEParser.SPEAKER, 0); }
		public TerminalNode MICROPHONE() { return getToken(SCHEDULEParser.MICROPHONE, 0); }
		public TerminalNode LAPTOP() { return getToken(SCHEDULEParser.LAPTOP, 0); }
		public TerminalNode SCREEN() { return getToken(SCHEDULEParser.SCREEN, 0); }
		public TerminalNode BOARD() { return getToken(SCHEDULEParser.BOARD, 0); }
		public FacilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterFacilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitFacilities(this);
		}
	}

	public final FacilitiesContext facilities() throws RecognitionException {
		FacilitiesContext _localctx = new FacilitiesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_facilities);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOARD) | (1L << SCREEN) | (1L << PROJECTOR) | (1L << SPEAKER) | (1L << MICROPHONE) | (1L << POINTER) | (1L << LAPTOP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lecture_listContext extends ParserRuleContext {
		public TerminalNode LECTURE() { return getToken(SCHEDULEParser.LECTURE, 0); }
		public List<A_lectureContext> a_lecture() {
			return getRuleContexts(A_lectureContext.class);
		}
		public A_lectureContext a_lecture(int i) {
			return getRuleContext(A_lectureContext.class,i);
		}
		public Lecture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterLecture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitLecture_list(this);
		}
	}

	public final Lecture_listContext lecture_list() throws RecognitionException {
		Lecture_listContext _localctx = new Lecture_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lecture_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(LECTURE);
			setState(85); match(T__13);
			setState(86); match(T__11);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87); a_lecture();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(92); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_lectureContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SCHEDULEParser.NAME, 0); }
		public List<TerminalNode> COURSEID() { return getTokens(SCHEDULEParser.COURSEID); }
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public TerminalNode COURSEID(int i) {
			return getToken(SCHEDULEParser.COURSEID, i);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public A_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterA_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitA_lecture(this);
		}
	}

	public final A_lectureContext a_lecture() throws RecognitionException {
		A_lectureContext _localctx = new A_lectureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_a_lecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(NAME);
			setState(95); match(T__18);
			setState(96); match(T__3);
			setState(97); match(T__13);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COURSEID) {
				{
				{
				setState(98); match(COURSEID);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); match(T__12);
			setState(105); match(T__2);
			setState(106); match(T__13);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(107); time();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public End_hContext end_h() {
			return getRuleContext(End_hContext.class,0);
		}
		public Start_hContext start_h() {
			return getRuleContext(Start_hContext.class,0);
		}
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(T__5);
			setState(116); match(T__6);
			setState(117); day();
			setState(118); match(T__7);
			setState(119); start_h();
			setState(120); match(T__0);
			setState(121); end_h();
			setState(122); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SCHEDULEParser.NUM, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_hContext extends ParserRuleContext {
		public TerminalNode HOUR() { return getToken(SCHEDULEParser.HOUR, 0); }
		public Start_hContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_h; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterStart_h(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitStart_h(this);
		}
	}

	public final Start_hContext start_h() throws RecognitionException {
		Start_hContext _localctx = new Start_hContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_start_h);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(HOUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_hContext extends ParserRuleContext {
		public TerminalNode HOUR() { return getToken(SCHEDULEParser.HOUR, 0); }
		public End_hContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_h; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterEnd_h(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitEnd_h(this);
		}
	}

	public final End_hContext end_h() throws RecognitionException {
		End_hContext _localctx = new End_hContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_end_h);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(HOUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_listContext extends ParserRuleContext {
		public List<A_classContext> a_class() {
			return getRuleContexts(A_classContext.class);
		}
		public A_classContext a_class(int i) {
			return getRuleContext(A_classContext.class,i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitClass_list(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(T__10);
			setState(131); match(T__13);
			setState(132); match(T__11);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133); a_class();
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COURSEID );
			setState(138); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_classContext extends ParserRuleContext {
		public TerminalNode COURSEID() { return getToken(SCHEDULEParser.COURSEID, 0); }
		public StudentContext student() {
			return getRuleContext(StudentContext.class,0);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public List<FacilitiesContext> facilities() {
			return getRuleContexts(FacilitiesContext.class);
		}
		public FacilitiesContext facilities(int i) {
			return getRuleContext(FacilitiesContext.class,i);
		}
		public A_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterA_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitA_class(this);
		}
	}

	public final A_classContext a_class() throws RecognitionException {
		A_classContext _localctx = new A_classContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_a_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(COURSEID);
			setState(141); match(T__18);
			setState(142); match(T__8);
			setState(143); match(T__13);
			setState(144); student();
			setState(145); match(T__12);
			setState(146); match(T__16);
			setState(147); match(T__13);
			setState(148); duration();
			setState(149); match(T__12);
			setState(150); match(T__15);
			setState(151); match(T__13);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOARD) | (1L << SCREEN) | (1L << PROJECTOR) | (1L << SPEAKER) | (1L << MICROPHONE) | (1L << POINTER) | (1L << LAPTOP))) != 0)) {
				{
				{
				setState(152); facilities();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StudentContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SCHEDULEParser.NUM, 0); }
		public StudentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_student; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterStudent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitStudent(this);
		}
	}

	public final StudentContext student() throws RecognitionException {
		StudentContext _localctx = new StudentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_student);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SCHEDULEParser.NUM, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitDuration(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Preference_listContext extends ParserRuleContext {
		public TerminalNode PREFERENCE() { return getToken(SCHEDULEParser.PREFERENCE, 0); }
		public List<A_preferenceContext> a_preference() {
			return getRuleContexts(A_preferenceContext.class);
		}
		public A_preferenceContext a_preference(int i) {
			return getRuleContext(A_preferenceContext.class,i);
		}
		public Preference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterPreference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitPreference_list(this);
		}
	}

	public final Preference_listContext preference_list() throws RecognitionException {
		Preference_listContext _localctx = new Preference_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_preference_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(PREFERENCE);
			setState(165); match(T__13);
			setState(166); match(T__11);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(167); a_preference();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_preferenceContext extends ParserRuleContext {
		public A_preferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_preference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterA_preference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitA_preference(this);
		}
	}

	public final A_preferenceContext a_preference() throws RecognitionException {
		A_preferenceContext _localctx = new A_preferenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_a_preference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraint_listContext extends ParserRuleContext {
		public List<A_constraintContext> a_constraint() {
			return getRuleContexts(A_constraintContext.class);
		}
		public A_constraintContext a_constraint(int i) {
			return getRuleContext(A_constraintContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(SCHEDULEParser.CONSTRAINT, 0); }
		public Constraint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterConstraint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitConstraint_list(this);
		}
	}

	public final Constraint_listContext constraint_list() throws RecognitionException {
		Constraint_listContext _localctx = new Constraint_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constraint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(CONSTRAINT);
			setState(178); match(T__13);
			setState(179); match(T__11);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(180); a_constraint();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_constraintContext extends ParserRuleContext {
		public A_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).enterA_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCHEDULEListener ) ((SCHEDULEListener)listener).exitA_constraint(this);
		}
	}

	public final A_constraintContext a_constraint() throws RecognitionException {
		A_constraintContext _localctx = new A_constraintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_a_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\5\2"+
		"\63\n\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\6\b[\n\b\r\b\16\b\\\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\7\tf\n\t\f\t\16\ti\13\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\6\16\u0089\n\16\r\16\16\16\u008a\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009c\n\17"+
		"\f\17\16\17\u009f\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\7\22\u00ab\n\22\f\22\16\22\u00ae\13\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\7\24\u00b8\n\24\f\24\16\24\u00bb\13\24\3\24\3\24\3\25\3"+
		"\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\27"+
		"\35\u00b7\2*\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\fT"+
		"\3\2\2\2\16V\3\2\2\2\20`\3\2\2\2\22u\3\2\2\2\24~\3\2\2\2\26\u0080\3\2"+
		"\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u008e\3\2\2\2\36\u00a2\3\2\2"+
		"\2 \u00a4\3\2\2\2\"\u00a6\3\2\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00be"+
		"\3\2\2\2*+\7\n\2\2+,\5\4\3\2,-\5\16\b\2-/\5\32\16\2.\60\5\"\22\2/.\3\2"+
		"\2\2/\60\3\2\2\2\60\62\3\2\2\2\61\63\5&\24\2\62\61\3\2\2\2\62\63\3\2\2"+
		"\2\63\64\3\2\2\2\64\65\7\f\2\2\65\3\3\2\2\2\66\67\7\26\2\2\678\7\b\2\2"+
		"8:\7\n\2\29;\5\6\4\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2"+
		">?\7\f\2\2?\5\3\2\2\2@A\5\b\5\2AB\7\3\2\2BC\7\4\2\2CD\7\b\2\2DE\5\n\6"+
		"\2EF\7\t\2\2FG\7\24\2\2GK\7\b\2\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2"+
		"\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\t\2\2O\7\3\2\2\2PQ\7%\2\2Q\t\3"+
		"\2\2\2RS\7%\2\2S\13\3\2\2\2TU\t\2\2\2U\r\3\2\2\2VW\7\36\2\2WX\7\b\2\2"+
		"XZ\7\n\2\2Y[\5\20\t\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2"+
		"\2\2^_\7\f\2\2_\17\3\2\2\2`a\7\37\2\2ab\7\3\2\2bc\7\22\2\2cg\7\b\2\2d"+
		"f\7 \2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2j"+
		"k\7\t\2\2kl\7\23\2\2lp\7\b\2\2mo\5\22\n\2nm\3\2\2\2or\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\t\2\2t\21\3\2\2\2uv\7\20\2\2vw\7"+
		"\17\2\2wx\5\24\13\2xy\7\16\2\2yz\5\26\f\2z{\7\25\2\2{|\5\30\r\2|}\7\21"+
		"\2\2}\23\3\2\2\2~\177\7%\2\2\177\25\3\2\2\2\u0080\u0081\7!\2\2\u0081\27"+
		"\3\2\2\2\u0082\u0083\7!\2\2\u0083\31\3\2\2\2\u0084\u0085\7\13\2\2\u0085"+
		"\u0086\7\b\2\2\u0086\u0088\7\n\2\2\u0087\u0089\5\34\17\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\f\2\2\u008d\33\3\2\2\2\u008e\u008f\7 \2\2"+
		"\u008f\u0090\7\3\2\2\u0090\u0091\7\r\2\2\u0091\u0092\7\b\2\2\u0092\u0093"+
		"\5\36\20\2\u0093\u0094\7\t\2\2\u0094\u0095\7\5\2\2\u0095\u0096\7\b\2\2"+
		"\u0096\u0097\5 \21\2\u0097\u0098\7\t\2\2\u0098\u0099\7\6\2\2\u0099\u009d"+
		"\7\b\2\2\u009a\u009c\5\f\7\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\7\t\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7%\2\2\u00a3\37"+
		"\3\2\2\2\u00a4\u00a5\7%\2\2\u00a5!\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8"+
		"\7\b\2\2\u00a8\u00ac\7\n\2\2\u00a9\u00ab\5$\23\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\f\2\2\u00b0#\3\2\2\2\u00b1\u00b2"+
		"\7\7\2\2\u00b2%\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b9"+
		"\7\n\2\2\u00b6\u00b8\5(\25\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\f\2\2\u00bd\'\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf)\3"+
		"\2\2\2\r/\62<K\\gp\u008a\u009d\u00ac\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}