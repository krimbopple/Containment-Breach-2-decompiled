Function removeitem%(arg0.items, arg1%)
    Local local0.items
    Local local1%
    If (arg0 = Null) Then
        Return $00
    EndIf
    catcherrors("RemoveItem()")
    If (selecteditem = arg0) Then
        selecteditem = Null
    EndIf
    local0 = C20FB8DZF
    C20FB8DZF = Null
    If (XDX22FZBZX(arg0, local0, arg1) <> 0) Then
        Return $00
    EndIf
    If (arg0\Field12 <> $00) Then
        freeentity(arg0\Field12)
        arg0\Field12 = $00
    EndIf
    freeentity(arg0\Field5)
    arg0\Field5 = $00
    freeentity(arg0\Field9)
    arg0\Field9 = $00
    For local1 = $00 To (maxitemamount - $01) Step $01
        If (TX60DB8XBBZ(local1) = arg0) Then
            TX60DB8XBBZ(local1) = Null
            Exit
        EndIf
    Next
    If (arg0\Field6\Field25 <> $00) Then
        freeimage(arg0\Field6\Field25)
        arg0\Field6\Field25 = $00
    EndIf
    If (arg0\Field6\Field15 <> $00) Then
        freeimage(arg0\Field6\Field15)
        arg0\Field6\Field15 = $00
    EndIf
    Delete arg0
    catcherrors("Uncaught: RemoveItem()")
    Return $00
End Function
