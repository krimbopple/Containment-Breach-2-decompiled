Function calculateroomextents%(arg0.rooms)
    Local local0#
    Local local1#
    tformvector(arg0\Field22\Field27, arg0\Field22\Field30, arg0\Field22\Field18, arg0\Field15, $00)
    arg0\Field36 = tformedx()
    arg0\Field24 = tformedy()
    arg0\Field23 = tformedz()
    tformvector(arg0\Field22\Field28, arg0\Field22\Field9, arg0\Field22\Field25, arg0\Field15, $00)
    arg0\Field34 = tformedx()
    arg0\Field5 = tformedy()
    arg0\Field38 = tformedz()
    tformvector(arg0\Field22\Field32, arg0\Field22\Field2, arg0\Field22\Field17, arg0\Field15, $00)
    arg0\Field6 = tformedx()
    arg0\Field11 = tformedy()
    arg0\Field28 = tformedz()
    If (arg0\Field34 < arg0\Field36) Then
        local0 = arg0\Field34
        arg0\Field34 = arg0\Field36
        arg0\Field36 = local0
    EndIf
    If (arg0\Field38 < arg0\Field23) Then
        local1 = arg0\Field38
        arg0\Field38 = arg0\Field23
        arg0\Field23 = local1
    EndIf
    arg0\Field36 = ((arg0\Field36 + 0.05) + arg0\Field6)
    arg0\Field24 = (arg0\Field24 + 0.05)
    arg0\Field23 = ((arg0\Field23 + 0.05) + arg0\Field28)
    arg0\Field34 = ((arg0\Field34 - 0.05) - arg0\Field6)
    arg0\Field5 = (arg0\Field5 - 0.05)
    arg0\Field38 = ((arg0\Field38 - 0.05) - arg0\Field28)
    Return $00
End Function
