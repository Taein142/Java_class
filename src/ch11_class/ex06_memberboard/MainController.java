package ch11_class.ex06_memberboard;

import ch11_class.ex06_memberboard.service.BoardService;
import ch11_class.ex06_memberboard.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        BoardService boardService = new BoardService();
        MemberService memberService = new MemberService();
        boolean run1 = true;
        boolean run2 = true;
        int selecNum1 = 0;
        int selecNum2 = 0;
        Scanner scanner = new Scanner(System.in);
        while (run1) {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("------------------------------------------------------------------------------------------");
            selecNum1 = scanner.nextInt();
            if (selecNum1 == 1) {
                memberService.save();
            } else if (selecNum1 == 2) {
                memberService.login();
            } else if (selecNum1 == 3) {
                memberService.memberList();
            } else if (selecNum1 == 4) {
                memberService.memberUpdate();
            } else if (selecNum1 == 5) {
                memberService.memberDelete();
            } else if (selecNum1 == 6) {
                memberService.logout();
            } else if (selecNum1 == 7) {
                while (run2) {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.종료");
                    System.out.println("--------------------------------------------------------------------------------");
                    selecNum2 = scanner.nextInt();
                    if (selecNum2 == 1) {
                        boardService.write();
                    } else if (selecNum2 == 2) {
                        boardService.boardList();
                    } else if (selecNum2 == 3) {
                        boardService.findBoard();
                    } else if (selecNum2 == 4) {
                        boardService.boardUpdate();
                    } else if (selecNum2 == 5) {
                        boardService.boardDelete();
                    } else if (selecNum2 == 6) {
                        boardService.boardDelete();
                    } else if (selecNum2 == 99) {
                        boardService.boardDelete();
                    } else if (selecNum2 == 0) {
                        run2 = false;
                    }
                }
            } else if (selecNum1 == 0) {
                run1 = false;
            }
        }
    }
}
