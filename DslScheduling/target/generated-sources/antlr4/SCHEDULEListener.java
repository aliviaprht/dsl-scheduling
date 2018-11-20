// Generated from SCHEDULE.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SCHEDULEParser}.
 */
public interface SCHEDULEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#start_h}.
	 * @param ctx the parse tree
	 */
	void enterStart_h(@NotNull SCHEDULEParser.Start_hContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#start_h}.
	 * @param ctx the parse tree
	 */
	void exitStart_h(@NotNull SCHEDULEParser.Start_hContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#a_lecture}.
	 * @param ctx the parse tree
	 */
	void enterA_lecture(@NotNull SCHEDULEParser.A_lectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#a_lecture}.
	 * @param ctx the parse tree
	 */
	void exitA_lecture(@NotNull SCHEDULEParser.A_lectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#a_class}.
	 * @param ctx the parse tree
	 */
	void enterA_class(@NotNull SCHEDULEParser.A_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#a_class}.
	 * @param ctx the parse tree
	 */
	void exitA_class(@NotNull SCHEDULEParser.A_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#student}.
	 * @param ctx the parse tree
	 */
	void enterStudent(@NotNull SCHEDULEParser.StudentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#student}.
	 * @param ctx the parse tree
	 */
	void exitStudent(@NotNull SCHEDULEParser.StudentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#end_h}.
	 * @param ctx the parse tree
	 */
	void enterEnd_h(@NotNull SCHEDULEParser.End_hContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#end_h}.
	 * @param ctx the parse tree
	 */
	void exitEnd_h(@NotNull SCHEDULEParser.End_hContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#constraint_list}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_list(@NotNull SCHEDULEParser.Constraint_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#constraint_list}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_list(@NotNull SCHEDULEParser.Constraint_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(@NotNull SCHEDULEParser.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(@NotNull SCHEDULEParser.Class_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#roomid}.
	 * @param ctx the parse tree
	 */
	void enterRoomid(@NotNull SCHEDULEParser.RoomidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#roomid}.
	 * @param ctx the parse tree
	 */
	void exitRoomid(@NotNull SCHEDULEParser.RoomidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#a_constraint}.
	 * @param ctx the parse tree
	 */
	void enterA_constraint(@NotNull SCHEDULEParser.A_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#a_constraint}.
	 * @param ctx the parse tree
	 */
	void exitA_constraint(@NotNull SCHEDULEParser.A_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#a_room}.
	 * @param ctx the parse tree
	 */
	void enterA_room(@NotNull SCHEDULEParser.A_roomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#a_room}.
	 * @param ctx the parse tree
	 */
	void exitA_room(@NotNull SCHEDULEParser.A_roomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#capacity}.
	 * @param ctx the parse tree
	 */
	void enterCapacity(@NotNull SCHEDULEParser.CapacityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#capacity}.
	 * @param ctx the parse tree
	 */
	void exitCapacity(@NotNull SCHEDULEParser.CapacityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(@NotNull SCHEDULEParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(@NotNull SCHEDULEParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#lecture_list}.
	 * @param ctx the parse tree
	 */
	void enterLecture_list(@NotNull SCHEDULEParser.Lecture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#lecture_list}.
	 * @param ctx the parse tree
	 */
	void exitLecture_list(@NotNull SCHEDULEParser.Lecture_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#a_preference}.
	 * @param ctx the parse tree
	 */
	void enterA_preference(@NotNull SCHEDULEParser.A_preferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#a_preference}.
	 * @param ctx the parse tree
	 */
	void exitA_preference(@NotNull SCHEDULEParser.A_preferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#scheduling}.
	 * @param ctx the parse tree
	 */
	void enterScheduling(@NotNull SCHEDULEParser.SchedulingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#scheduling}.
	 * @param ctx the parse tree
	 */
	void exitScheduling(@NotNull SCHEDULEParser.SchedulingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#preference_list}.
	 * @param ctx the parse tree
	 */
	void enterPreference_list(@NotNull SCHEDULEParser.Preference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#preference_list}.
	 * @param ctx the parse tree
	 */
	void exitPreference_list(@NotNull SCHEDULEParser.Preference_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull SCHEDULEParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull SCHEDULEParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#facilities}.
	 * @param ctx the parse tree
	 */
	void enterFacilities(@NotNull SCHEDULEParser.FacilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#facilities}.
	 * @param ctx the parse tree
	 */
	void exitFacilities(@NotNull SCHEDULEParser.FacilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(@NotNull SCHEDULEParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(@NotNull SCHEDULEParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCHEDULEParser#room_list}.
	 * @param ctx the parse tree
	 */
	void enterRoom_list(@NotNull SCHEDULEParser.Room_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCHEDULEParser#room_list}.
	 * @param ctx the parse tree
	 */
	void exitRoom_list(@NotNull SCHEDULEParser.Room_listContext ctx);
}