Function GUESSEDupdatetform%(arg0.doors, arg1#, arg2#, arg3#)
    If (arg0\Field38 <> 0) Then
        Return $00
    EndIf
    tformpoint(arg1, arg2, arg3, $00, arg0\Field51)
    blitz_X480XDB4860(arg0, (0.0 >= tformedz()), $00)
    Return $00
End Function
