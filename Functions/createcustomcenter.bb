Function createcustomcenter%(arg0.rooms, arg1#, arg2#)
    arg0\Field35 = createpivot($00)
    positionentity(arg0\Field35, arg1, 0.0, arg2, $00)
    entityparent(arg0\Field35, arg0\Field15, $01)
    Return $00
End Function
