Function removeprop%(arg0.props)
    freeentity(arg0\Field0)
    arg0\Field0 = $00
    Delete arg0
    arg0 = Null
    Return $00
End Function
