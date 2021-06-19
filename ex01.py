import turtle as t

t.shape('turtle')
t.fd(100)
t.left(120)
t.fd(100)
t.left(120)
t.fd(100)
t.left(120)
t.circle(50)
t.color('red')
t.pensize(5)
for i in range(4):
    t.fd(100)
    t.left(90)

t.penup()
t.goto(-200,50)
t.pendown()
t.color('purple')
t.begin_fill()
for i in range(5):
    t.fd(100)
    t.left(75)
t.end_fill()
t.penup()
t.goto(-100,50)

t.mainloop()

