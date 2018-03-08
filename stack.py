import tkinter
from tkinter import messagebox
from tkinter import *
top = tkinter.Tk()

def pushBtnCall():
     try:
        int(txtAdd.get())
        lstItems.insert(0,txtAdd.get())
        txtAdd.delete(0,END)
     except ValueError:
        messagebox.showerror("Error", "Please enter an integer")

    
def popBtnCall():
    lstItems.delete ( lstItems.size()-1, last=None )

def peak():
    messagebox.showinfo("Peak", lstItems.get(lstItems.size()-1, END) + " is the last Item")

txtAdd = Entry(top,bd = 4)
txtAdd.pack()

pushBtn = tkinter.Button(top, text ="push", command = pushBtnCall)
pushBtn.pack()

popBtn = tkinter.Button(top,  text ="pop", command = popBtnCall)
popBtn.pack()

peakBtn = tkinter.Button(top, text ="peak", command = peak)
peakBtn.pack()

clearBtn = tkinter.Button(top,  text ="clear", command = popBtnCall)
clearBtn.pack()

lstItems = Listbox(top, width=30, height=10)
lstItems.pack(side = RIGHT)

top.mainloop()

