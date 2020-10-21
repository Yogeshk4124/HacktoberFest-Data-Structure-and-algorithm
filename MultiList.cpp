#include<bits/stdc++.h>
using namespace std;

struct node {
	int slot;
	string subject;
	node *next;
};

class multiList {
	node *week_heads[6];
public:
	multiList() {
		for (int i = 0 ; i < 6 ; i++)
			week_heads[i] = NULL;
	}

	void insert(int w, node *n) {
		node *temp;

		if ((week_heads[w] == NULL) || ((week_heads[w]->slot) >= (n->slot))) {
			n->next = week_heads[w];
			week_heads[w] = n;
		}
		else {
			temp = week_heads[w];
			while (temp->next != NULL && temp->next->slot < n->slot)
				temp = temp->next;

			n->next = temp->next;
			temp->next = n;
		}

		cout << "\n\t=> Slot added Successfully\n\n";
	}

	void printWeekDaySchedule(int lNo) {
		node *itr = week_heads[lNo];
		cout << "\nOn WeekDay-" << lNo + 1 << ":";
		while (itr != NULL) {
			cout << "\n\tSlot: " << itr->slot << " -> Subject: " << itr->subject;
			itr = itr->next;
		}
		cout << endl;
	}

	void showTimeTable() {
		for (int i = 0 ; i < 6 ; i++)
			printWeekDaySchedule(i);
	}

};

int main() {

	multiList timeTable;

	int week, timeSlot;
	string subj;

	int opt;
	cout << "***** MultiList *****" << endl;
	do {
		cout << "\tSelect from the given options: \n";
		cout << "\t\t1.) Add Slot in Time Table\n\t\t2.) Show TimeTable\n";
		cout << "\t\tOption: ";
		cin >> opt;

		if (opt == 1) {
			node *newNode = new node;

			cout << "\t\t\tOn which Day of Week ?\n\t\t\t=> ";
			cin >> week;
			cout << "\t\t\tIn which Slot ?\n\t\t\t=> ";
			cin >> timeSlot;
			cout << "\t\t\tWhich Subject ?\n\t\t\t=> ";
			cin >> subj;

			newNode->slot = timeSlot;
			newNode->subject = subj;
			newNode->next = NULL;

			timeTable.insert(week - 1, newNode);
		}

	} while (opt == 1);

	timeTable.showTimeTable();

	return 0;
}
