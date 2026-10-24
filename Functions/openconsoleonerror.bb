Function openconsoleonerror%(arg0$)
    If (((((menuopen Lor consoleopen) Lor (opt\Field62 = $00)) Lor (opt\Field28 = $00)) Lor (T8X2046020\Field4 = $00)) <> 0) Then
        Return $00
    EndIf
    If ((millisec Mod $5DC) < $320) Then
        If (arg0 <> "") Then
            createconsolemsg(arg0, $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        EndIf
        consoleopen = $01
    EndIf
    Return $00
End Function
