Function Z868X8B02%(arg0#, arg1#, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8#)
    If (((T484F2XDF = Null) Lor (X4BX024DX0() = $00)) <> 0) Then
        Return $00
    EndIf
    If (T8X2046020\Field1 = $00) Then
        Return $01
    EndIf
    arg6 = (arg6 - arg2)
    renderbar(blinkmeterimg, (Int arg5), (Int arg6), (Int arg7), (Int arg8), T484F2XDF\Field7, 100.0, $C1, $C1, $C1, $00)
    If (DD4DX84F() <> 0) Then
        If (T484F2XDF\Field6 <> 0) Then
            color($00, $00, $96, $FF)
        Else
            color($00, $C1, $1E, $FF)
        EndIf
    Else
        color($FF, $FF, $FF, $FF)
    EndIf
    drawimage(X2Z260BF0Z\Field3[$0E], (Int (arg5 - arg3)), $00, $01)
    Return $01
    Return $00
End Function
