package linkedList;

public class Polynomial {
	public static void method() {
		int[] poly1Coeff = { 2, -5, 7 };
		int[] poly1Pow = { 2, 1, 0 };
		int[] poly2Coeff = { 3, 7 };
		int[] poly2Pow = { 1, 0 };
		PNode poly1 = formPoly(poly1Coeff, poly1Pow);
		PNode poly2 = formPoly(poly2Coeff, poly2Pow);
		PNode poly = sumPoly(poly1, poly2);
		PNode cur = poly;
		while (cur != null) {
			System.out.print("(" + cur.coeff + "X^" + cur.pow + ") ");
			cur = cur.next;
		}

	}

	private static PNode sumPoly(PNode poly1, PNode poly2) {
		PNode head = null, cur = null;
		PNode node = null;
		while (poly1 != null && poly2 != null) {

			if (poly1.pow > poly2.pow) {
				node = new PNode(poly1.coeff, poly1.pow);
				poly1 = poly1.next;

			} else if (poly2.pow > poly1.pow) {
				node = new PNode(poly2.coeff, poly2.pow);
				poly2 = poly2.next;

			} else {
				node = new PNode(poly2.coeff + poly1.coeff, poly2.pow);
				poly1 = poly1.next;
				poly2 = poly2.next;
			}
			if (head == null) {
				head = node;
				cur = node;
			} else {
				cur.next = node;
				cur = node;
			}
		}
		while (poly1 != null) {
			node = new PNode(poly1.coeff, poly1.pow);
			poly1 = poly1.next;
			if (head == null) {
				head = node;
				cur = node;
			} else {
				cur.next = node;
				cur = node;
			}

		}
		while (poly2 != null) {
			node = new PNode(poly2.coeff, poly2.pow);
			poly2 = poly2.next;
			if (head == null) {
				head = node;
				cur = node;
			} else {
				cur.next = node;
				cur = node;
			}

		}
		// TODO Auto-generated method stub
		return head;
	}

	public static PNode formPoly(int[] coeff, int[] pow) {
		PNode head = null;
		PNode cur = null;
		for (int i = 0; i < pow.length; i++) {
			PNode node = new PNode(coeff[i], pow[i]);
			if (head == null) {
				head = node;
				cur = node;
			} else {
				cur.next = node;
				cur = node;
			}
			System.out.print("(" + cur.coeff + "X^" + cur.pow + ") ");

		}
		System.out.println();
		return head;
	}

}
