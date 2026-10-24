Function runtimeerrorex%(arg0$)
    If (errormessageinitialized <> 0) Then
        XXZ6880X02(arg0)
        memoryaccessviolation("")
    Else
        runtimeerror(arg0)
    EndIf
    Return $00
End Function
