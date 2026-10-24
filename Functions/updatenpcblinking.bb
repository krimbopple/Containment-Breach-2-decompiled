Function updatenpcblinking%(arg0.npcs)
    If (0.0 >= arg0\Field9) Then
        arg0\Field9 = (rnd(5.0, 10.0) * 70.0)
    EndIf
    arg0\Field9 = (arg0\Field9 - fps\Field3[$00])
    Return $00
End Function
