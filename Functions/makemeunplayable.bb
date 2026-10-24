Function makemeunplayable%(arg0%)
    If (XZ0260X8X2\Field38 = $02) Then
        resetselectedstuff()
        resetinput(10.0)
        XZ0260X8X2\Field38 = ((arg0 = $00) + $00)
    EndIf
    Return $00
End Function
