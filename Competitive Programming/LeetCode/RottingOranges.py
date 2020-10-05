import copy

CELL_WITH_EMPTY = 0
CELL_WITH_FRESH_ORANGE = 1
CELL_WITH_ROTTEN_ORANGE = 2

input_orange = [[0,2]] #[[2,1,1],[0,1,1],[1,0,1]] #[[2,1,1],[1,1,0],[0,1,1]]  #[[2,0,1],[0,1,1],[1,0,1]]  #[[0,2]]

def check_rotten_orange(input_orange) : 
    original_input_orange = input_orange
    input_orange_next_minute = copy.deepcopy(input_orange) # Copy Value from input_orange (Protect issue pass by reference)
    count = -1
    while True :
        if input_orange == input_orange_next_minute and count > -1 :
            if bool([x for x in input_orange_next_minute if 1 in x]) :
                return -1
            else :
                return count
        else :
            input_orange = copy.deepcopy(input_orange_next_minute)
            print(input_orange)
            for no_row in range(len(input_orange)) :
                #print(input_orange[no_row])
                for no_cell in range(len(input_orange[no_row])):
                    #print(no_row , no_cell , input_orange[no_row][no_cell] , input_orange[no_row])
                    if no_row - 1 > -1 :  # check rotten orange on top of cell
                        if input_orange[no_row - 1][no_cell] is CELL_WITH_ROTTEN_ORANGE :
                            if input_orange[no_row][no_cell] is CELL_WITH_FRESH_ORANGE :
                                input_orange_next_minute[no_row][no_cell] = CELL_WITH_ROTTEN_ORANGE
                                #print("T" , no_row , no_cell , input_orange[no_row][no_cell] , input_orange , input_orange_next_minute)
                    if no_cell - 1 > -1 :  # check rotten orange on left of cell
                        if input_orange[no_row][no_cell - 1 ] is CELL_WITH_ROTTEN_ORANGE :
                            if input_orange[no_row][no_cell] is CELL_WITH_FRESH_ORANGE :
                                input_orange_next_minute[no_row][no_cell] = CELL_WITH_ROTTEN_ORANGE
                                #print("L" , no_row , no_cell , input_orange[no_row][no_cell] , input_orange , input_orange_next_minute)
                    if no_cell + 1 < len(input_orange[no_row]) :  # check rotten orange on right of cell
                        if input_orange[no_row][no_cell + 1 ] == CELL_WITH_ROTTEN_ORANGE :
                            if input_orange[no_row][no_cell] == CELL_WITH_FRESH_ORANGE :
                                input_orange_next_minute[no_row][no_cell] = CELL_WITH_ROTTEN_ORANGE
                                #print("R" , no_row , no_cell , input_orange[no_row][no_cell] , input_orange[no_row])
                    if no_row + 1 < len(input_orange) :  # check rotten orange on bottom of cell
                        if input_orange[no_row + 1][no_cell] == CELL_WITH_ROTTEN_ORANGE :
                            if input_orange[no_row][no_cell] == CELL_WITH_FRESH_ORANGE :
                                input_orange_next_minute[no_row][no_cell] = CELL_WITH_ROTTEN_ORANGE
                                #print("B" , no_row , no_cell , input_orange[no_row][no_cell] , input_orange[no_row])
                    #print(input_orange)
            count = count + 1
            print(count)
            print(input_orange_next_minute)

count = check_rotten_orange(input_orange) 
print(count)     