grammar SCHEDULE;

scheduling: '[' room_list lecture_list class_list preference_list? constraint_list? ']';

room_list: ROOM ':' '[' a_room+ ']';
ROOM: [R|r]'oom';
a_room: roomid '->' 'capacity' ':' capacity ';' 'facility' ':' facilities* ';';
roomid: NUM;
capacity: NUM;
facilities: BOARD | SCREEN | PROJECTOR | SPEAKER | MICROPHONE | POINTER | LAPTOP;
BOARD: [B|b]'oard';
SCREEN: [S|s]'creen';
PROJECTOR: [P|p]'rojector';
SPEAKER: [S|s]'peaker';
MICROPHONE: [M|m]'icrophone';
POINTER: [P|p]'ointer';
LAPTOP: [L|l]'aptop';

lecture_list: LECTURE ':' '[' a_lecture+ ']';
LECTURE: [L|l]'ecture';
a_lecture: NAME '->' 'course' ':' COURSEID* ';' 'available' ':' time* ';';
NAME: [a-zA-Z]+;
COURSEID: 'IF'[1-9][0-9][0-9][0-9];
time: '(' 'day' day 'hour' start_h '-' end_h ')';
day: NUM;
start_h: HOUR;
end_h: HOUR;
HOUR:[7-9] | [1][0-8];

class_list: 'Class' ':' '[' a_class+ ']';
CLASS: [C|c]'lass';
a_class: COURSEID '->' 'student' ':' student ';' 'duration' ':' duration ';' 'require' ':' facilities* ';';
student: NUM;
duration: NUM;

preference_list: PREFERENCE ':' '[' a_preference* ']';
PREFERENCE: [P|p]'reference';
a_preference: 'x';

constraint_list: CONSTRAINT ':' '[' a_constraint* ']';
CONSTRAINT: [C|c]'onstraint';
a_constraint: 'x';

NUM: [1-9]([0-9]*);
WS: [ \t\n\r]+ -> skip ;
COMMA: [,]+ -> skip ;