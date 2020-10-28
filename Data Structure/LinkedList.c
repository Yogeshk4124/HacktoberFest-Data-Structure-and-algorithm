#include<stdio.h>
#include<stdlib.h>

typedef struct node                          //Linked List Creation
{
    int info;
    struct node *next;
}NODE;

NODE *head,*temp;

void initializer(int d)
{
    NODE *link=(NODE*)malloc(sizeof(NODE));
    link->info=d;
    link->next=NULL;
    if(head==NULL)                                       //Initialization of 1st Element in the Linked List
    {
        head=link;
        temp=link;
    }
    else                                                //Initialization of Elements in the Linked List(except 1st)
    {
        temp->next=link;
        temp=link;
    }
}

void insertion()
{
    int d,op,el;
    NODE *new_node=(NODE *)malloc(sizeof(NODE));

    printf("\n\tSelect from the given options:\n");
    printf("\t\t1) Front \n\t\t2) Rear \n\t\t3) Middle\n");
    printf("\n\t\tEnter the Option: ");
    scanf("%d",&op);
    printf("Enter the Number to be Inserted: ");
    scanf("%d",&d);
    switch(op)
    {
        case 1: new_node->info=d;                                                          //Front Insertion
                new_node->next=head;
                head=new_node;
                break;
        case 2: new_node->info=d;                                                          //Rear Insertion
                new_node->next=NULL;
                NODE *tm=head;
                while((tm->next)!=NULL)
                {
                    tm=tm->next;
                }
                tm->next=new_node;
                break;
        case 3: printf("Enter the Element before which Data need to be Inserted: ");       //Middle Insertion
                scanf("%d",&el);
                new_node->info=d;
                NODE *tp=head, *prev_node;
                while(tp->info!=el)
                {
                    prev_node=tp;
                    tp=tp->next;
                }
                new_node->next=tp;
                prev_node->next=new_node;
                break;
        default: printf("\nEnter a Valid Option!!");
    }
}

void deletion()
{
    int op,dl;
    NODE *tm;

    printf("\n\tSelect from the given options:\n");
    printf("\t\t1) Front \n\t\t2) Rear \n\t\t3) Middle\n");
    printf("\n\t\tEnter the Option: ");
    scanf("%d",&op);
    switch(op)
    {
        case 1: tm=head;                                                                    //Front Deletion
                head=head->next;
                free(tm);
                break;
        case 2: tm=head;                                                                    //Rear Deletion
                while(tm->next->next)
                {
                    tm=tm->next;
                }
                free(tm->next);
                tm->next=NULL;
                break;
        case 3: printf("Enter the Element before which Data need to be Deleted: ");       //Middle Deletion
                scanf("%d",&dl);
                tm=head;
                NODE *prev_node, *tm2;
                while(tm->next->info!=dl)
                {
                    prev_node=tm;
                    tm=tm->next;
                }
                tm2=tm->next;
                prev_node->next->next=tm2->next;
                free(tm2);
                break;
        default: printf("\nEnter a Valid Option!!");
    }

}

void display()
{
    NODE *tmp;
    tmp=head;
    printf("\n>>>>>  ");
    while(tmp!=NULL)
    {
        printf("%d -> ",tmp->info);
        tmp=tmp->next;
    }
    printf(" <<<<<\n");
}


int main()
{
    int n,i,t;
    printf("Enter the number of Elements: ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        printf("\nEnter the Element: ");
        scanf("%d",&t);

        initializer(t);
    }

    printf("::::::::::LINKED LIST::::::::::\n");

    while(1)                                       //Menu-Based Insertion/Deletion/Display
    {
        printf("\nSelect from the given options:\n");
        printf("  1) Insertion \n  2) Deletion \n  3) Display\n  4) Exit\n");
        int opt;
        printf("\nEnter the Option: ");
        scanf("%d",&opt);
        switch(opt)
        {
            case 1: insertion();                  //Insertion Function
                    break;
            case 2: deletion();                   //Deletion Function
                    break;
            case 3: display();                    //Display Function
                    break;
            case 4: exit(0);                      //Exit Function
                    break;
            default: printf("\nEnter a Valid Option!!");
        }
    }

    return 0;
}
