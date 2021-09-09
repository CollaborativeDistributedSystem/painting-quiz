# painting-quiz

## Application Description
1) Server를 먼저 실행시켜 Client가 들어올 수 계속 대기를 한다. \
2) Client가 Server에서 설정한 IP, ID, ANS(문제의 답)을 Server로 보낸다.\
3) Server가 Client가 보낸 ID, ANS 정보를 받아 ArrayList에 User정보를 저장한 후 해당 User를 위한 Thread를 실행시킨다.\
4) 해당 Thread는 한 Client가 Action을 취할 때 마다 Protocol에 맞춰 다른 Client들에게 메시지를 보낸다.\
5) 메시지를 받은 유저들은 Protocol에 맞춰 Action을 취한다.\
6) Server가 GameStart 버튼을 누르면 Client들에게 게임을 시작한다는 메시지를 보내고 들어온 순서대로 게임을 시작한다.\
7) 제출 문제는 Client들이 들어올 때 입력한 ANS이며 다른 Client들은 채팅창에 정답을 입력하면 Server에서 일치한다면 정답임을 알려주고 다음 차례로 넘어간다.\
8) Client가 LogOut을 할 경우 해당 Client가 나갔다는 Message를 뿌려준다.\
