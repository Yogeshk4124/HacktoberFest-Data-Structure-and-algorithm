#include<stdio.h>

int queue1[50],queue2[50],front_q1=-1,rear_q1=-1,front_q2=-1,rear_q2=-1,size;

void enque(int d)
{
    if(rear_q1==size-front_q1-1)                         //OverFlow Condition
    {
        printf("The Stack is FULL!!");
    }
    else if(front_q1==-1 && rear_q1==-1)                 //Empty Queue
    {
        front_q1=rear_q1=0;
        queue1[rear_q1]=d;
    }
    else                                           //Some items are present
    {
        int temp;
        while(front_q1==rear_q1)
        {
            temp=queue1[front_q1++];
            //
            if(rear_q2==size-front_q2-1)                         //OverFlow Condition
            {
                printf("The Queue is FULL!!");
            }
            else if(front_q2==-1 && rear_q2==-1)                 //Empty Queue
            {
                front_q2=rear_q2=0;
                queue2[rear_q2]=temp;
            }
            else                                           //Some items are present
            {
                rear_q2++;
                queue2[rear_q2]=temp;
            }
        }
    }

        queue2[rear_q2++]=queue1[front_q1];

        front_q1=rear_q1=0;
        queue1[front_q1]=d;

        int t;

        while(front_q2==rear_q2)
        {
            t=queue2[front_q2++];
            queue2[rear_q2++]=t;
        }

}

int deque()
{
    int p;
    if(front_q1==rear_q1)
    {
        p=queue1[front_q1];
        front_q1=rear_q1=-1;
    }
    else
    {
        p=queue1[front_q1++];
    }
    return p;
}

void display()
{
    int i;
    if(front_q1==-1 && rear_q1==-1)
        printf("\nThe Stack is Empty!!");
    else
    {
        printf("\nThe Stack is: ");
        for(i=front_q1;i<=rear_q1;i++)
        {
            printf("%d\t",queue1[i]);
        }
        printf("\n");
    }
}

int main()
{
    printf("Enter the Size of the Stack(Max.-50): ");
    scanf("%d",&size);

    printf("::::::::::Implementation of STACK using QUEUE::::::::::\n");

    while(1)                         //Menu-Based Push/Pop/Display
    {
        printf("\nSelect from the given options:\n");
        printf("  1) Push \n  2) Pop \n  3) Display \n  4) Exit\n");
        int opt,pop_el;
        printf("\nEnter the Option: ");
        scanf("%d",&opt);
        switch(opt)
        {
            case 1: {
                    int el;
                    printf("\nEnter Stack Element: ");
                    scanf("%d",&el);
                    enque(el);                  //Push Function
                    }
                    break;
            case 2: pop_el=deque();                    //Pop Function
                    break;
            case 3: display();                    //Stack Display Function
                    break;
            case 4: exit(0);
                    break;
            default: printf("\nEnter a Valid Option!!");
        }
    }

    return 0;
}
