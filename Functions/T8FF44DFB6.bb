Function T8FF44DFB6%(arg0.X82B82400, arg1%)
    If (arg0\Field4 <> 0) Then
        Return $00
    EndIf
    If (arg1 <> grabbedentity) Then
        arg0\Field10 = (arg0\Field10 - fps\Field3[$01])
        If (0.0 >= arg0\Field10) Then
            rotateentity(arg1, clamp(curvevalue(arg0\Field8, entitypitch(arg1, $01, 1.0), 4.0), -89.9, 89.9), curveangle(arg0\Field7, entityyaw(arg1, $01, 1.0), 4.0), curveangle(arg0\Field2, entityroll(arg1, $01, 1.0), 4.0), $01)
        EndIf
    Else
        TXDFXDZXXDD\Field13 = arg0
        arg0\Field10 = 35.0
    EndIf
    Return $00
End Function
