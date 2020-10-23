#include<stdio.h>
#include<stdlib.h>

typedef struct sparse                          //Sparse Matrix Creation
{
    int row_no;
    int col_no;
    int data;
    struct sparse *next;
}SPARSE;

SPARSE *head,*temp;

void insert(int rn, int cn, int d)
{
    SPARSE *link=(SPARSE*)malloc(sizeof(SPARSE));
    link->row_no=rn;
    link->col_no=cn;
    link->data=d;
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

void display(int r,int c)
{
    SPARSE *tmp;
    tmp=head;
    int i,j;
    printf("\n>>>>> SPARSE MATRIX  <<<<<\n");
    while(tmp!=NULL)
    {
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                printf("%d\t",tmp->data);
                tmp=tmp->next;
            }
            printf("\n");
        }
    }
}

void check_sparse(int r,int c)
{
    SPARSE *tmp;
    tmp=head;
    int i,j,ctr=0;
    while(tmp!=NULL)
    {
        if(tmp->data==0)
                    ctr++;
        tmp=tmp->next;
    }
    if(ctr>(r*c)/2)
        printf("\nThe Given Matrix is a SPARSE Matrix!!");
    else
        printf("\nThe Given Matrix is NOT a Sparse Matrix!!");
}

int main()
{
    int row,col;
    printf("Enter the Number of Rows: ");
    scanf("%d",&row);
    printf("\nEnter the Number of Columns: ");
    scanf("%d",&col);

    int mtx[row][col],i,j;
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("\nEnter the Matrix Element: ");
            scanf("%d",&mtx[i][j]);
        }
    }

    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            if(mtx[i][j]!=0)
                insert(i,j,mtx[i][j]);
            else
                insert(i,j,0);
        }
    }

    display(row,col);
    check_sparse(row,col);

    return 0;
}
