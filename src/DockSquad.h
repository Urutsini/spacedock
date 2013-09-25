//
//  DockSquad.h
//  Space Dock
//
//  Created by Rob Tsuk on 9/24/13.
//  Copyright (c) 2013 Rob Tsuk. All rights reserved.
//

#import <CoreData/CoreData.h>
#import <Foundation/Foundation.h>

@class DockEquippedShip;

@interface DockSquad : NSManagedObject

@property (nonatomic, retain) NSString* name;
@property (nonatomic, retain) NSOrderedSet* equippedShips;
@end

@interface DockSquad (CoreDataGeneratedAccessors)

-(void)insertObject:(DockEquippedShip*)value inEquippedShipsAtIndex:(NSUInteger)idx;
-(void)removeObjectFromEquippedShipsAtIndex:(NSUInteger)idx;
-(void)insertEquippedShips:(NSArray*)value atIndexes:(NSIndexSet*)indexes;
-(void)removeEquippedShipsAtIndexes:(NSIndexSet*)indexes;
-(void)replaceObjectInEquippedShipsAtIndex:(NSUInteger)idx withObject:(DockEquippedShip*)value;
-(void)replaceEquippedShipsAtIndexes:(NSIndexSet*)indexes withEquippedShips:(NSArray*)values;
-(void)addEquippedShipsObject:(DockEquippedShip*)value;
-(void)removeEquippedShipsObject:(DockEquippedShip*)value;
-(void)addEquippedShips:(NSOrderedSet*)values;
-(void)removeEquippedShips:(NSOrderedSet*)values;
@end