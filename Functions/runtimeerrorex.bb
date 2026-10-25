Function runtimeerrorex%(arg0$)
    If (errormessageinitialized <> 0) Then
        GUESSEDseterrormsg(arg0)
        memoryaccessviolation("")
    Else
        runtimeerror(arg0)
    EndIf
    Return $00
End Function
